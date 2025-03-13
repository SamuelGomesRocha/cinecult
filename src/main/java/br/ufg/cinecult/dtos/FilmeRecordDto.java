package br.ufg.cinecult.dtos;

import br.ufg.cinecult.models.ProgramacaoModel;
import jakarta.validation.constraints.NotBlank;

public record FilmeRecordDto(@NotBlank String titulo, ProgramacaoModel programacao, @NotBlank String direcao, @NotBlank String sinopse, @NotBlank String anoEstreia, @NotBlank String duracao, @NotBlank String caminhoImagem) {

}
