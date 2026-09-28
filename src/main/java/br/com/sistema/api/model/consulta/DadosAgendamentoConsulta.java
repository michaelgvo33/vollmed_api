package br.com.sistema.api.model.consulta;

import java.time.LocalDateTime;

public record DadosAgendamentoConsulta (
    Integer MedicoId,
    Integer PacienteId,
    String observacao,
    Status status,
    LocalDateTime data
) 

    {
}
