package tech.ada.challenge.StatusCartao.resposta;

import lombok.Data;
import tech.ada.challenge.StatusCartao.requisicao.RequisicaoCliente;

@Data
public class RespostaCliente extends RequisicaoCliente {
    private String identificador;
}
