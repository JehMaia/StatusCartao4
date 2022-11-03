package tech.ada.challenge.StatusCartao.requisicao;

import lombok.Data;

@Data
public class RequisicaoCliente extends RequisicaoClientePatch{

    private String cpf;

}
