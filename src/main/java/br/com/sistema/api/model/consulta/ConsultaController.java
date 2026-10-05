package br.com.sistema.api.model.consulta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;

@RestController 
@RequestMapping ("/consultas")
public class ConsultaController {

    @Autowired 
    private ConsultaRepository consultaRepository;

    @Autowired 
    private MedicoRepository medicoRepository;  

    @Autowired 
    // private PacienteRepository pacienteRepository;

    // @Autowired
    // privatePacienteRepository pacienteRepository;    
   
    // POST - Criar uma nova consulta
    @PostMapping 
    @Transactional 
    public Consulta agendar(@RequestBody DadosAgendamentoConsulta dados) {
        var medico = medicoRepository.getReferenceById(dados.MedicoId());
        // var paciente = pacienteRepository.getReferenceById(dados.PacienteId());
        var paciente = new Paciente();
        paciente.setId(dados.PacienteId());
        var consulta = new Consulta(dados);
        consulta.setMedico(medico);
        consulta.setPaciente(paciente);
        consultaRepository.save(consulta);
        return consulta;
    }   


    
}

/** var significa que a variavel não foi definida aina. Com isso, a var irá receber o tipo do obhetivo. Var é uma palavra chave que está disponivel a prtir da versão 10 do Java. O Compilado infere o tipo dessa varivel com  base no valor atribuido a ela.
 * 
*/
