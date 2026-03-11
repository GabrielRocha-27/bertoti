package com.thehecklers.sburrestdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Ferramenta {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String nome;
    private int lote;
    private int dificuldade;

    public Ferramenta() {}

    public Ferramenta(String nome, int lote, int dificuldade) {
        this.nome = nome;
        this.lote = lote;
        this.dificuldade = dificuldade;
    }

    public String getId() { return id; }
    public String getNome() { return nome; }
    public int getLote() { return lote; }
    public int getDificuldade() { return dificuldade; }

    public void setNome(String nome) { this.nome = nome; }
    public void setLote(int lote) { this.lote = lote; }
    public void setDificuldade(int dificuldade) { this.dificuldade = dificuldade; }
}
