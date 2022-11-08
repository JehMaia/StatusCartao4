package tech.ada.challenge.StatusCartao.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.ada.challenge.StatusCartao.requisicao.RequisicaoCartao;
import tech.ada.challenge.StatusCartao.requisicao.RequisicaoCartaoPatch;
import tech.ada.challenge.StatusCartao.resposta.RespostaCartao;
import tech.ada.challenge.StatusCartao.servico.*;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import tech.ada.challenge.StatusCartao.requisicao.RequisicaoCliente;
import tech.ada.challenge.StatusCartao.requisicao.RequisicaoClientePatch;
import tech.ada.challenge.StatusCartao.resposta.RespostaCliente;
import tech.ada.challenge.StatusCartao.servico.IncluirClienteServico;

import java.util.List;


    @RestController
    @RequestMapping("/v1/cliente")
    @RequiredArgsConstructor
    @Slf4j

    public class CartaoController {


        private final IncluirCartaoServico incluirCartaoServico;
        private final ConsultarCartaoServico consultarCartaoServico;
        private final ListarCartaoServico listarCartaoServico;

        //http://localhost:8080/v1/cartao
        @PostMapping(path = "", produces = "application/json")
        @ResponseStatus(HttpStatus.CREATED)
        public RespostaCartao criarCartao (@RequestBody RequisicaoCartao requisicaoCartao){
            log.info("Info {}", requisicaoCartao);
            return incluirCartaoServico.executar(requisicaoCartao);
        }

        //http://localhost:8080/v1/cartao/<identificador>
        @GetMapping(path = "/{identificador}")
        @ResponseStatus(HttpStatus.CREATED)
        public RespostaCartao consultarCartao (@PathVariable("identificador") String identificador){
            return consultarCartaoServico.executar(identificador);
        }

        //http://localhost:8080/v1/cartao/<identificador>
        @DeleteMapping(path = "/{identificador}")
        public RespostaCartao removerCartao(@PathVariable("identificador") String identificador){
            return new RespostaCartao();
        }

        //http://localhost:8080/v1/cartao/<identificador>
        @PatchMapping(path = "/{identificador}")
        public RespostaCartao atualizarCartao(@RequestBody RequisicaoCartaoPatch cartaoPatch,
                                                @PathVariable("identificador") String identificador){
            return new RespostaCartao();
        }

        //http://localhost:8080/v1/cartao
        @GetMapping (path = "")
        public List<RespostaCartao> listarCartao(){
            return listarCartaoServico.executar();
        }





    }


