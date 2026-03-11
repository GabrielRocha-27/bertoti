package com.thehecklers.sburrestdemo.service;

import com.thehecklers.sburrestdemo.model.Ferramenta;
import com.thehecklers.sburrestdemo.repository.FerramentaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FerramentaService {
    // Declarar a variável repository
    private final FerramentaRepository repository;

    // Injetar via construtor
    public FerramentaService(FerramentaRepository repository) {
        this.repository = repository;
    }

    public List<Ferramenta> getFerramentas() {
        return repository.findAll();
    }

    public Optional<Ferramenta> getFerramentaById(String id) {
        return repository.findById(id);
    }

    public Ferramenta addFerramenta(Ferramenta ferramenta) {
        return repository.save(ferramenta);
    }

    public Ferramenta updateFerramenta(String id, Ferramenta ferramenta) {
        if (repository.existsById(id)) {
            return repository.save(ferramenta);
        } else {
            return repository.save(ferramenta);
        }
    }

    public void deleteFerramenta(String id) {
        repository.deleteById(id);
    }

//    public List<Ferramenta> getFerramentas() {
//        return ferramentas;
//    }
//
//    public Optional<Ferramenta> getFerramentaById(String id) {
//        return ferramentas.stream()
//                .filter(f -> f.getId().equals(id))
//                .findFirst();
//    }
//
//    public Ferramenta addFerramenta(Ferramenta ferramenta) {
//        ferramentas.add(ferramenta);
//        return ferramenta;
//    }
//
//    public Ferramenta updateFerramenta(String id, Ferramenta ferramenta) {
//        for (int i = 0; i < ferramentas.size(); i++) {
//            if (ferramentas.get(i).getId().equals(id)) {
//                ferramentas.set(i, ferramenta);
//                return ferramenta;
//            }
//        }
//        ferramentas.add(ferramenta);
//        return ferramenta;
//    }
//
//    public void deleteFerramenta(String id) {
//        ferramentas.removeIf(f -> f.getId().equals(id));
//    }

    public Ferramenta salvar(Ferramenta ferramenta) {
        return repository.save(ferramenta);
    }
}
