package tech.ada.challenge.StatusCartao.entidades;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cliente")
@Data
public class Cliente {

//    @Column(nullable = false) = não pode receber resultado nulo, tem que trazer alguma informação
//    @Column(nullable = true) = pode receber resultado nulo
//    @Column(name = "id_endereco") = caso a coluna no SQL esteja com um nome diferente do atributo da Classe


    @Id
    @Column(nullable = false) // não pode receber resultado nulo, tem que trazer alguma informação
    private String cpf;

    @Column(name = "nome_cliente", nullable = false)
    private String nome;

    @OneToMany
    @JoinColumn(name = "id_endereco")
    private List<Endereco> enderecoList; // o endereço com essa ID pertence somente a esse cliente

    @ManyToMany
    @JoinColumn(name = "id_conta")
    private List<Conta> contaList; // a conta com essa ID pode pertencer a mais de um cliente (conta conjunta)

    @OneToMany
    @JoinColumn(name = "numero_cartao")
    private List<Cartao> cartaoList; // o cartão com essa numeração pertence somente a esse cliente

}
