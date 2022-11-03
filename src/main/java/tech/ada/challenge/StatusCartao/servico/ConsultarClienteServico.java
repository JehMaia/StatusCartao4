package tech.ada.challenge.StatusCartao.servico;

import org.springframework.stereotype.Service;
import tech.ada.challenge.StatusCartao.resposta.RespostaCliente;

import java.util.UUID;

@Service
public class ConsultarClienteServico {

    public RespostaCliente executar(String identificador) {
        RespostaCliente respostaCliente =  new RespostaCliente();
        respostaCliente.setIdentificador(UUID.randomUUID().toString());
        return respostaCliente;
    }

}
