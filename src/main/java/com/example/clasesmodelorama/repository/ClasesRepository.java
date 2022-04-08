package com.example.clasesmodelorama.repository;

import com.example.clasesmodelorama.Clases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClasesRepository extends JpaRepository<Clases,Integer> {
    @Query("select c from Clases c where c.name =?1 and c.clase.name like concat('%',?2,'%')")
    List<Clases> findByNameContaining(String name,String moduleName);
    @Query("select c from Clases c where c.clase.name=?1")
    List<Clases> findAllWithThisModuleName(String moduleName);
}
