package com.pti.api.controller;

import com.pti.api.endereco.DadosEndereco;

public record DadosCadastroPaciente(String nome,
                                    String email,
                                    String telefone,
                                    String cpf,
                                    DadosEndereco endereco) {

}
