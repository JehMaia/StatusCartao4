package tech.ada.challenge.StatusCartao.servico;

import org.springframework.stereotype.Service;
import tech.ada.challenge.StatusCartao.resposta.RespostaCliente;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ListarClienteServico {
    public List<RespostaCliente> executar() {
        List <RespostaCliente> respostaClientes = new ArrayList<>();
        for (int i=1;i<=5;i++){
            RespostaCliente respostaCliente = new RespostaCliente();
            respostaCliente.setIdentificador(UUID.randomUUID().toString());
            respostaClientes.add(respostaCliente);
        }
        return respostaClientes;
    }
}
