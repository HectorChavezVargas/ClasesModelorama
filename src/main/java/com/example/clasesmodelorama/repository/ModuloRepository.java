package com.example.clasesmodelorama.repository;

import com.example.clasesmodelorama.Modulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ModuloRepository extends JpaRepository<Modulo,Integer> {
    List<Modulo> findByNameContaining(String name);
}
