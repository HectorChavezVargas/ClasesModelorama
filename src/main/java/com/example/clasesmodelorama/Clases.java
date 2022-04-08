package com.example.clasesmodelorama;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Clases {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String image;
    @ManyToOne
    @JoinColumn(name = "moduloid")
    private Modulo clase;
}

