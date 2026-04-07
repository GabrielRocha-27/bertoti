package br.com.rocha.spring_boot_lab3.service;

import br.com.rocha.spring_boot_lab3.database.model.Ferramenta;
import br.com.rocha.spring_boot_lab3.database.repository.FerramentaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FerramentaService {

    private final FerramentaRepository repository;

    public FerramentaService(FerramentaRepository repository) {
        this.repository = repository;
    }

    public Ferramenta salvar(Ferramenta ferramenta) {
        return repository.save(ferramenta);
    }

    public List<Ferramenta> listar() {
        return repository.findAll();
    }

    public Optional<Ferramenta> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}