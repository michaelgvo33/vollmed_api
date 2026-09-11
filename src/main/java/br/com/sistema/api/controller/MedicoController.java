package br.com.sistema.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    // GET Request -> Exibe a home
    @GetMapping("/")
    public String exibirHome() {
        return "a";
    }

    // POST Request -> Cadastro do médico
    @PostMapping("/cadastro")
    public String cadastrarMedico(String dados) {
        return dados;
    }

    // CRUD
    // GET    -> Consultar
    // POST   -> Cadastrar
    // PUT    -> Alterar
    // DELETE -> Excluir
}