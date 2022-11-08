package tech.ada.challenge.StatusCartao.requisicao;

import lombok.Data;

import java.time.LocalDate;

@Data
public class RequisicaoCartaoPatch {

    private String numeroCartao;
    private String statusCartao; //(ativo/cancelado)
    private LocalDate dataEmissao;
    private Integer idConta;
    private boolean tipoCartaoDebito; //debito, credito,multiplo
    private String bandeira; //visa, master e elo
    private boolean prateleira;
    private String bin; //seis primeiros numeros do cartao
    private String numeroAr;
    private String statusEntrega;


}
