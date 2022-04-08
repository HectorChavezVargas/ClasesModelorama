package com.example.clasesmodelorama;

import com.example.clasesmodelorama.repository.ClasesRepository;
import com.example.clasesmodelorama.repository.ModuloRepository;
import com.example.clasesmodelorama.service.ClasesService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestInsertionToDB {
    @Autowired
    ClasesService clasesService;

    @Test
    void testMethodInModuloService(){
        System.out.println(clasesService.encontrarTodasClases());
    }

    @Test
    void testFindClassesForThisModule(){
        System.out.println(clasesService.encontrarClasesDeModulo("inventarios"));
    }

    @Test
    void testFindClasesForSpecificModule(){
        System.out.println(clasesService.encontrarClasesDeModuloPorBusqueda("clase 1",null));
    }
}
