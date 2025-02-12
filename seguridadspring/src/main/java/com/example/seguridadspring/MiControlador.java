package com.example.seguridadspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiControlador {

    @GetMapping("/publico")
    public String publico() {
        return "Este es un mensaje público. ¡Bienvenido!";
    }

    @GetMapping("/privado")
    public String privado() {
        return "Este es un mensaje privado. Solo para usuarios autenticados.";
    }
}