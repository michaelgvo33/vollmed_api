package br.com.sistema.api.model.consulta;

import br.com.sistema.api.model.medico.Medico;
import br.com.sistema.api.model.paciente.Paciente;

import java.time.LocalDateTime;
import jakarta.persistence.*;
import lombok.*;

@Entity 
@Table (name = "consultas")
@Data 
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

public class Consulta {

    @Id 
    @GeneratedValue (strategy =  GenerationType.IDENTITY)
    private Integer id;

    private String observacao;

    @ManyToOne 
    @JoinColumn(name = "pacienteId")
    private Paciente paciente;

   @ManyToOne 
    @JoinColumn(name = "medicoId")
    private Medico medico;
    
    private LocalDateTime data;

    @Enumerated (EnumType.STRING)
    private Status status;

    // Terceiro construtor da classe Consulta que recebe a conversão do DadosAgendamentoConsulta para a classe Consulta

    public Consulta(DadosAgendamentoConsulta dados) {
        this.medico = new Medico();
        this.medico.setId(dados.MedicoId());
        this.paciente.setId(dados.PacienteId());
        this.paciente = new Paciente();
        this.status = dados.status();
        this.observacao = dados.observacao();
        this.data = dados.data();
    
} 



}




/**
 * 
 @ManyToOne -> Relacionamentos: Muitas consultas para um médico e muitas consultas para um paciente.
=> Sempre o primeiro termo é referencia
 * 
 * @Enumerated (EnumType.STRING) -> Enumeração: O status da consulta será armazenado como uma string no banco de dados.
 * 
 * @Data, @Getter, @Setter, @AllArgsConstructor, @NoArgsConstructor, @EqualsAndHashCode(of = "id") -> Anotações do Lombok para gerar automaticamente métodos como getters, setters, construtores e equals/hashCode.
 * 
 * @Id -> Identificador único da entidade Consulta.
 * 
 * @GeneratedValue (strategy = GenerationType.IDENTITY) -> Estratégia de geração de valor para o identificador.
 * 
 * @Table (name = "consultas") -> Nome da tabela no banco de dados.
 * 
 */

