package tech.ada.challenge.StatusCartao.entidades;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "conta")
@Data
public class Conta {

//    @Column(nullable = false) = não pode receber resultado nulo, tem que trazer alguma informação
//    @Column(nullable = true) = pode receber resultado nulo
//    @Column(name = "id_endereco") = caso a coluna no SQL esteja com um nome diferente do atributo da Classe

    @Id
    @Column(name = "id_conta", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // usado para criação de ID's aleatórias
    private Long idConta;

    @Column(nullable = false)
    private String agencia;

    @Column(name = "numero_conta", nullable = false)
    private String numeroConta;

    @Column(nullable = false)
    private String segmento;

    @Column(name = "tipo_conta", nullable = false)
    private String tipoConta;

    @Column(name = "status_conta", nullable = false)
    private String statusConta;

    @ManyToMany
    @JoinColumn (name = "cpf")
    private Cliente cliente; // a conta com essa ID pode pertencer a mais de um cliente (conta conjunta)

    @OneToMany
    @JoinColumn(name = "numero_cartao")
    private List<Cartao> cartaoList; // o cartão com essa numeração pertence somente a essa conta

}
