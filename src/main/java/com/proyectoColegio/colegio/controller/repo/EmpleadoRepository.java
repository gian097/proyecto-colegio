package com.proyectoColegio.colegio.controller.repo;

import com.proyectoColegio.colegio.modelos.Empleado;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface EmpleadoRepository  extends CrudRepository<Empleado, Integer> {
    @Query(value="SELECT * FROM empleado where colegio_id= ?1", nativeQuery=true)
    public abstract ArrayList<Empleado> findByColegio(Integer id);
}
