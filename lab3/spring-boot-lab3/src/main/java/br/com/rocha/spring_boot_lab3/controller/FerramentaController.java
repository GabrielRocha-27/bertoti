package br.com.rocha.spring_boot_lab3.controller;

import br.com.rocha.spring_boot_lab3.database.model.Ferramenta;
import br.com.rocha.spring_boot_lab3.service.FerramentaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/ferramenta")
public class FerramentaController {

    private final FerramentaService service;

    public FerramentaController(FerramentaService service) {
        this.service = service;
    }

    // POST (criar)
    @PostMapping
    public Ferramenta criar(@RequestBody Ferramenta ferramenta) {
        return service.salvar(ferramenta);
    }

    // GET (listar)
    @GetMapping
    public List<Ferramenta> listar() {
        return service.listar();
    }

    // GET por ID
    @GetMapping("/{id}")
    public Ferramenta buscar(@PathVariable Long id) {
        return service.buscarPorId(id)
                .orElseThrow(() -> new RuntimeException("Ferramenta não encontrada"));
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }

    // Atualizar
    @PutMapping("/{id}")
    public Ferramenta atualizar(@PathVariable Long id, @RequestBody Ferramenta ferramenta) {
        ferramenta.setLote(id);
        return service.salvar(ferramenta);
    }
}