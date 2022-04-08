package com.example.clasesmodelorama.controller;

import com.example.clasesmodelorama.service.ClasesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("")
public class ModuloController {
    private ClasesService service;

    public ModuloController(ClasesService service) {
        this.service = service;
    }

    @PostMapping("/buscar")
    public String clasesDeIndexPorBusqueda(@RequestParam String search, Model model){
        model.addAttribute("clases",service.encontrarClasesDeModuloPorBusqueda(search,null));
        return "index";
    }

    @GetMapping("")
    public String mostrarIndex(Model model){
        model.addAttribute("clases",service.encontrarClasesDeModulo("nuevaventa"));
        return "index";
    }

    @PostMapping("/inventarios/buscar")
    public String clasesDeInventariosPorBusqueda(@RequestParam String search, Model model){
        model.addAttribute("clases",service.encontrarClasesDeModuloPorBusqueda(search,null));
        return "inventarios";
    }

    @GetMapping("/inventarios")
    public String mostrarClasesDeInventarios(Model model){
        model.addAttribute("clases",service.encontrarClasesDeModulo("inventarios"));
        return "inventarios";
    }

    @PostMapping("/reportes/buscar")
    public String clasesDeReportesPorBusqueda(@RequestParam String search, Model model){
        model.addAttribute("clases",service.encontrarClasesDeModuloPorBusqueda(search,null));
        return "reportes";
    }

    @GetMapping("/reportes")
    public String mostrarClasesDeReportes(Model model){
        model.addAttribute("clases",service.encontrarClasesDeModulo("reportes"));
        return "reportes";
    }

    @PostMapping("/promociones/buscar")
    public String clasesDePromocionesPorBusqueda(@RequestParam String search, Model model){
        model.addAttribute("clases",service.encontrarClasesDeModuloPorBusqueda(search,null));
        return "promociones";
    }

    @GetMapping("/promociones")
    public String mostrarClasesDePromociones(Model model){
        model.addAttribute("clases",service.encontrarClasesDeModulo("promociones"));
        return "promociones";
    }

    @PostMapping("/soporte/buscar")
    public String clasesDeSoportePorBusqueda(@RequestParam String search, Model model){
        model.addAttribute("clases",service.encontrarClasesDeModuloPorBusqueda(search,null));
        return "soporte";
    }

    @GetMapping("/soporte")
    public String mostrarClasesDeSoporte(Model model){
        model.addAttribute("clases",service.encontrarClasesDeModulo("soporte"));
        return "soporte";
    }

    @GetMapping("/post/{modulo}/{clase}")
    public String mostrarPost(Model model, @PathVariable(name = "clase") String clase, @PathVariable(name = "modulo") String modulo){
        model.addAttribute("clase",service.encontrarClasesDeModuloPorBusqueda(clase,modulo).get(0));
        return "post";
    }

}
