package br.ufg.cinecult.dtos;

import jakarta.validation.constraints.NotBlank;

public record FilmeRecordDto(@NotBlank String titulo, @NotBlank String direcao, @NotBlank String sinopse, @NotBlank String anoEstreia, @NotBlank String duracao, @NotBlank String caminhoImagem) {

}
