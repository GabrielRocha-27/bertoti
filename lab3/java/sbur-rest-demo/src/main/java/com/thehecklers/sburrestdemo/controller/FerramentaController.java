package com.thehecklers.sburrestdemo.controller;

import com.thehecklers.sburrestdemo.model.Ferramenta;
import com.thehecklers.sburrestdemo.service.FerramentaService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/ferramentas")
public class FerramentaController {
    private final FerramentaService service;

    public FerramentaController(FerramentaService service) {
        this.service = service;
    }

    @GetMapping
    Iterable<Ferramenta> getFerramentas() {
        return service.getFerramentas();
    }

    @GetMapping("/{id}")
    Optional<Ferramenta> getFerramentaById(@PathVariable String id) {
        return service.getFerramentaById(id);
    }

    @PostMapping
    public Ferramenta criar(@RequestBody Ferramenta ferramenta) {
        return service.salvar(ferramenta);
    }


    @PutMapping("/{id}")
    ResponseEntity<Ferramenta> putFerramenta(@PathVariable String id,
                                             @RequestBody Ferramenta ferramenta) {

        Ferramenta updated = service.updateFerramenta(id, ferramenta);
        return new ResponseEntity<>(updated, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    void deleteFerramenta(@PathVariable String id) {
        service.deleteFerramenta(id);
    }
}
