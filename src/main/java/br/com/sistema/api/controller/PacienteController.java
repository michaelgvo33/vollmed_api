package br.com.sistema.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("paciente")
public class PacienteController { 
    
    @GetMapping("/") // Aponta para localhost:8081/paciente
    public String exibirHome() {
        return "a";
    }

    // GET/PUT Request -> Atualizar dados do Paciente
    @PutMapping("/atualizar") // Isso criará a rota: localhost:8081/paciente/atualizar
    public String alterarPaciente() {
        // Aqui dentro você colocará a lógica para buscar no banco e atualizar futuramente
        return "Paciente atualizado com sucesso!";
    }
}
