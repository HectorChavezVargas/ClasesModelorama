package com.example.clasesmodelorama;

import com.example.clasesmodelorama.repository.ClasesRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestService {
    @Autowired
    ClasesRepository clasesRepository;

    @Test
    void testSomething(){
        clasesRepository.findAllWithThisModuleName("nuevaventa").forEach(System.out::println);
    }
}
