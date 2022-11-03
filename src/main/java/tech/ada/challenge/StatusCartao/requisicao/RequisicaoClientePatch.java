package tech.ada.challenge.StatusCartao.requisicao;

import lombok.Data;

@Data
public class RequisicaoClientePatch {

    private String nome;
    private EnderecoRequisicao enderecoRequisicao;

}
