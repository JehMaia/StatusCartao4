package tech.ada.challenge.StatusCartao.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import tech.ada.challenge.StatusCartao.requisicao.RequisicaoCliente;
import tech.ada.challenge.StatusCartao.requisicao.RequisicaoClientePatch;
import tech.ada.challenge.StatusCartao.resposta.RespostaCliente;
import tech.ada.challenge.StatusCartao.servico.ConsultarClienteServico;
import tech.ada.challenge.StatusCartao.servico.IncluirClienteServico;
import tech.ada.challenge.StatusCartao.servico.ListarClienteServico;

import java.util.List;

@RestController
@RequestMapping("/v1/cliente")
@RequiredArgsConstructor
@Slf4j

public class ClienteController {


    private final IncluirClienteServico incluirClienteServico;
    private final ConsultarClienteServico consultarClienteServico;
    private final ListarClienteServico listarClienteServico;

    //http://localhost:8080/v1/cliente
    @PostMapping(path = "", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public RespostaCliente criarCliente(@RequestBody RequisicaoCliente requisicaoCliente){
        log.info("Info {}", requisicaoCliente);
        return incluirClienteServico.executar(requisicaoCliente);
    }

    //http://localhost:8080/v1/cliente/<identificador>
    @GetMapping(path = "/{identificador}")
    @ResponseStatus(HttpStatus.CREATED)
    public RespostaCliente consultarCliente(@PathVariable("identificador") String identificador){
        return consultarClienteServico.executar(identificador);
    }

    //http://localhost:8080/v1/cliente/<identificador>
    @DeleteMapping(path = "/{identificador}")
    public RespostaCliente removerCliente(@PathVariable("identificador") String identificador){
        return new RespostaCliente();
    }

    //http://localhost:8080/v1/cliente/<identificador>
    @PatchMapping(path = "/{identificador}")
    public RespostaCliente atualizarCliente(@RequestBody RequisicaoClientePatch clientePatch,
                                            @PathVariable("identificador") String identificador){
        return new RespostaCliente();
    }

    //http://localhost:8080/v1/cliente
    @GetMapping (path = "")
    public List<RespostaCliente> listarClientes(){
        return listarClienteServico.executar();
        }

// DA FORMA ABAIXO RETORNA 200
//    @PostMapping(path = "", produces = "application/json")
//    public RequisicaoCliente criarCliente(@RequestBody RequisicaoCliente requisicaoCliente){
//       log.info("Info {}", requisicaoCliente);
//       return requisicaoCliente;
//    }

// DA FORMA ABAIXO RETORNA 201, CÓDIGO ESCRITO MAIS DIFÍCIL
//    @PostMapping(path = "", produces = "application/json")
//    public ResponseEntity<RequisicaoCliente> criarCliente(@RequestBody RequisicaoCliente requisicaoCliente){
//        log.info("Info {}", requisicaoCliente);
//        return new ResponseEntity(requisicaoCliente, HttpStatus.CREATED);
//    }

// DA FORMA ABAIXO RETORNA 201, CÓDIGO ESCRITO MAIS FÁCIL
//    @PostMapping(path = "", produces = "application/json")
//    @ResponseStatus(HttpStatus.CREATED)
//    public RequisicaoCliente criarCliente(@RequestBody RequisicaoCliente requisicaoCliente){
//        log.info("Info {}", requisicaoCliente);
//        return requisicaoCliente;
//    }

}
