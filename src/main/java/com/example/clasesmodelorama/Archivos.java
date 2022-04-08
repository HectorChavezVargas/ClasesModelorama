package com.example.clasesmodelorama;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Archivos{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String document;
    @OneToOne
    @JoinColumn(name = "moduloid")
    private Modulo archivo;
}
