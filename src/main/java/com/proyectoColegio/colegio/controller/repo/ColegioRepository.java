package com.proyectoColegio.colegio.controller.repo;

import com.proyectoColegio.colegio.modelos.Colegio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Anotacion que le dice a Spring que esta clase es un repositorio
public interface ColegioRepository extends JpaRepository<Colegio, Integer> {
}
