package br.com.sistema.api.model.paciente;

import br.com.sistema.api.model.endereco.DadosCadastroEndereco;

// DTO do cadastro das informações do paciente
public record DadosCadastroPaciente(
    Integer id, 
    String nome, 
    String email, 
    DadosCadastroEndereco endereco,
    String telefone,
    String cpf
) {
    
}
   
