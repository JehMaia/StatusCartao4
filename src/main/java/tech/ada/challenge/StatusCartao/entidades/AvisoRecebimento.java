package tech.ada.challenge.StatusCartao.entidades;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "aviso_recebimento")
@Data
public class AvisoRecebimento {

//    @Column(nullable = false) = não pode receber resultado nulo, tem que trazer alguma informação
//    @Column(nullable = true) = pode receber resultado nulo
//    @Column(name = "id_endereco") = caso a coluna no SQL esteja com um nome diferente do atributo da Classe

    @Id
    @Column(name = "numero_AR", nullable = false)
    private String numeroAr;

    @Column(name = "status_entrega", nullable = false)
    private String statusEntrega;

    @OneToOne
    @JoinColumn(name = "numero_cartao")
    private List<Cartao> cartaoList; // um cartão pertence a uma AR
}
