package br.ufg.cinecult.dtos;

import jakarta.validation.constraints.NotBlank;

import java.util.Date;

public record UsuarioRecordDto(@NotBlank String nome, @NotBlank String email, @NotBlank String senha, @NotBlank String cpf, @NotBlank
                               Date dataNascimento) {
}
