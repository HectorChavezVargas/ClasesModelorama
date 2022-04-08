package com.example.clasesmodelorama;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Modulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany(mappedBy = "clase")
    private List<Clases> clasesList;
    @OneToOne(mappedBy = "archivo")
    private Archivos archivo;
}
