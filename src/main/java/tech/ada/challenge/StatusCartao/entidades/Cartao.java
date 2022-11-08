package tech.ada.challenge.StatusCartao.entidades;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "cartao")
@Data
public class Cartao {

//    @Column(nullable = false) = não pode receber resultado nulo, tem que trazer alguma informação
//    @Column(nullable = true) = pode receber resultado nulo
//    @Column(name = "id_endereco") = caso a coluna no SQL esteja com um nome diferente do atributo da Classe

    @Id
    @Column(name = "numero_cartao", nullable = false)
    private String numeroCartao;

    @Column(name = "status_cartao", nullable = false)
    private String statusCartao;

    @Column(name = "data_emissao", nullable = false)
    private LocalDate dataEmissão;

    @Column(name = "tipo_cartao", nullable = false)
    private String tipoCartao;

    @Column(nullable = false)
    private String bandeira;

    @Column(name = "prateleira", nullable = false)
    private boolean temPrateleira; // tem que estar preenchido verdadeiro ou falso, não pode ser nulo!

    @Column(nullable = false)
    private String bin;

    @Column(name = "status_ntrega", nullable = false)
    private String statusEntrega; // AR - tem que fazer a chave para vincular a entidade, ao invés de ficar descrito da forma que está

    @OneToOne
    @JoinColumn (name = "numero_AR")
    private AvisoRecebimento avisoRecebimento; // uma AR pertence a um cartão

    @ManyToOne
    @JoinColumn (name = "id_conta")
    private Conta conta; // uma conta pode ter muitos cartões

    @ManyToOne
    @JoinColumn (name = "cpf")
    private Cliente cliente; // um cliente pode ter muitos cartões



}
