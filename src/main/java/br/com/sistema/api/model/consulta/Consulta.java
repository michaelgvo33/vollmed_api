package br.com.sistema.api.model.consulta;

import br.com.sistema.api.model.medico.Medico;
import br.com.sistema.api.model.paciente.Paciente;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

    private Paciente paciente;
    private Medico medico;
    private LocalDateTime data;

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

// @ManyToOne -> Relacionamentos: Muitas consultas para um médico e muitas consultas para um paciente.
