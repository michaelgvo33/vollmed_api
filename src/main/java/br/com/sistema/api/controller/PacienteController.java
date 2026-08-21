package br.com.sistema.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("paciente") // Define o caminho base para os endpoints do controlador

public class PacienteController {
    @GetMapping("/")
    public String exibirMenu () {
        return "Bem-vindo ao sistema de pacientes!";
    }
    
    
}
