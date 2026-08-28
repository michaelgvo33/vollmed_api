package br.com.sistema.api.model.medico;

import br.com.sistema.api.model.endereco.Endereco;
import jakarta.persistence.*;
import lombok.*;

@Entity 
@Table(name = "medicos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String email;
    private String telefone;
    private String crm;

@Enumerated(EnumType.STRING)

    private Especialidade especialidade;

    @Embedded // Utilizando na classe que representa a tabela principal no banco de dados.
    private Endereco endereco;

    
}
