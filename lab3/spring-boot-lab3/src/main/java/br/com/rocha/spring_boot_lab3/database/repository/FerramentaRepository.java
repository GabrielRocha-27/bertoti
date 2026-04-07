package br.com.rocha.spring_boot_lab3.database.repository;

import br.com.rocha.spring_boot_lab3.database.model.Ferramenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FerramentaRepository extends JpaRepository<Ferramenta, Long> {
}