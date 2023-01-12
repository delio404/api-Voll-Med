package com.pti.api.medico;


import com.pti.api.endereco.Endereco;
import com.pti.api.enums.Especialidade;
import jakarta.persistence.*;
import lombok.*;


@Table(name = "medicos")
@Entity(name = "medico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String telefone;

    private String email;

    private String crm;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @Embedded
    private Endereco endereco;


    public Medico(DadosCadastroMedico dados) {
        this.nome= dados.nome();
        this.email = dados.email();
        this.telefone= dados.telefone();
        this.crm = dados.crm();
        this.especialidade= dados.especialidade();
        this.endereco= new Endereco(dados.endereco());
    }

    public void atualizarInformacoes(DadosAtualizaMedico dados) {
        if (dados.nome() != null){
            this.nome= dados.nome();
        }
        if (dados.telefone() != null){
            this.telefone= dados.telefone();
        }
        if (dados.endereco() != null){
            this.endereco.atualizarInformacoes(dados.endereco());
        }

    }
}
