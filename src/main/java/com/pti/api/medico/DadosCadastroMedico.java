package com.pti.api.medico;

import com.pti.api.endereco.DadosEndereco;
import com.pti.api.enums.Especialidade;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import javax.validation.constraints.Email;

public record DadosCadastroMedico(
                                @NotBlank
                                String nome,


                                @NotBlank
                                @Email
                                String email,

                                @NotBlank
                                String telefone,

                                @NotBlank
                                @Pattern(regexp = "\\d{4,6}")
                                String crm,
                                @NotNull
                                Especialidade especialidade,

                                @NotNull
                                @Valid
                                DadosEndereco  endereco) {



}
