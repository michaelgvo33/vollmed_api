package br.com.sistema.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Registra a clase OlaController como um controlador REST
@RequestMapping("ola") // Define o caminho base para os endpoints do controlador

public class OlaController {
    @GetMapping("/olamundo") // Método HTTP tipo GET
    public String olaMundo() {
        return "Olá, mundo!";
    }
    
}
