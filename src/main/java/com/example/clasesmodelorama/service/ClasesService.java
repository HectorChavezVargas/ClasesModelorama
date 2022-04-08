package com.example.clasesmodelorama.service;

import com.example.clasesmodelorama.Clases;
import com.example.clasesmodelorama.repository.ClasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClasesService {
    private ClasesRepository repository;

    public ClasesService(ClasesRepository clasesRepository) {
        this.repository = clasesRepository;
    }

    public List<Clases> encontrarClasesDeModuloPorBusqueda(String search, String nombreModulo){
        if(nombreModulo==null){
            nombreModulo="";
        }
            return repository.findByNameContaining(search,nombreModulo);
    }

    public List<Clases> encontrarTodasClases(){
        return repository.findAll();
    }

    public List<Clases> encontrarClasesDeModulo(String nombreModulo){
        return repository.findAllWithThisModuleName(nombreModulo);
    }
}
