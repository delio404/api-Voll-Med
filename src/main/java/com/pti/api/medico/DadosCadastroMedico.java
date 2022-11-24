package com.pti.api.medico;

import com.pti.api.endereco.DadosEndereco;
import com.pti.api.enums.Especialidade;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {



}
