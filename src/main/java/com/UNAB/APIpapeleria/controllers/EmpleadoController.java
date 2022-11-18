package com.UNAB.APIpapeleria.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {

    @GetMapping
    public String leerEmpleado(){

        return "Jonatan Cardenas";
    }
    @PostMapping
    public String crearEmpleado(){

        return "Empleado creado con exito";
    }
    
}
