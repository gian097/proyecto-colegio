package com.proyectoColegio.colegio.service;

import com.proyectoColegio.colegio.modelos.Colegio;
import com.proyectoColegio.colegio.controller.repo.ColegioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//Le decimos a Spring que esta clase es de servicios
@Service
public class ColegioService {
    @Autowired //Conectamos esta clase con el repository de Colegio
    ColegioRepository colegioRepository; //Creamos un objeto tipo ColegioRepository para poder usar los metodos que dicha clase hereda

    //Metodo que retornará la lista de Colegios usando metodos heredados del jpaRepository
    public List<Colegio> getAllColegios(){
        List<Colegio> coleList = new ArrayList<>();
        colegioRepository.findAll().forEach(colegio -> coleList.add(colegio));  //Recorremos el iterable que regresa el metodo findAll del Jpa y lo guardamos en la lista creada
        return coleList;
    }

    //Metodo que me trae un objeto de tipo Colegio cuando cuento con el id de la misma
    public Colegio getColegioById(Integer id){
        return colegioRepository.findById(id).get();
    }

    //Metodo para guardar o actualizar objetos de tipo Colegio
    public boolean saveOrUpdateColegio(Colegio colegio){
        Colegio cole=colegioRepository.save(colegio);
        if (colegioRepository.findById(cole.getId())!=null){
            return true;
        }
        return false;
    }

    //Metodo para eliminar Colegios registradas teniendo el id
    public boolean deleteColegio(Integer id){
        colegioRepository.deleteById(id);  //Eliminar

        if (colegioRepository.findById(id)!=null){  //Verificacion del servicio eliminacion
            return true;
        }
        return false;
    }
    
}
