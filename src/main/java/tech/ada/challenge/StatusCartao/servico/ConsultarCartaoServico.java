package tech.ada.challenge.StatusCartao.servico;

import tech.ada.challenge.StatusCartao.resposta.RespostaCartao;
import tech.ada.challenge.StatusCartao.resposta.RespostaCliente;

import java.util.UUID;

public class ConsultarCartaoServico {
    public RespostaCartao executar(String statusEntrega) {

            RespostaCartao respostaCartao =  new RespostaCartao();
            respostaCartao.setStatusEntrega(UUID.randomUUID().toString());
            return respostaCartao;
    }
}
