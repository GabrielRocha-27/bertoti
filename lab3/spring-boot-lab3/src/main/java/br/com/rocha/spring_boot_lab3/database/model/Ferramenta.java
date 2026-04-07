package br.com.rocha.spring_boot_lab3.database.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ferramenta")
public class Ferramenta {

    @Id
    @Column(name = "lote")
    private Long lote;

    @Column(name = "nome_ferramenta")
    private String nomeFerramenta;

    @Column(name = "nivel_dificuldade")
    private String nivelDificuldade;
}
