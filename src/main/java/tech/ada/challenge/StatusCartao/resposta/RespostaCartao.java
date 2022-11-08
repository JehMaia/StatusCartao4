package tech.ada.challenge.StatusCartao.resposta;

import lombok.Data;
import tech.ada.challenge.StatusCartao.requisicao.RequisicaoCartao;


    @Data
    public class RespostaCartao extends RequisicaoCartao {
        private String StatusEntrega;

        public void add(RespostaCartao respostaCartao1) {
        }
    }


