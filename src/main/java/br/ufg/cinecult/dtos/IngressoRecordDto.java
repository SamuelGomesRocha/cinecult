package br.ufg.cinecult.dtos;

import br.ufg.cinecult.enums.FormaPagamento;
import br.ufg.cinecult.models.FilmeModel;
import br.ufg.cinecult.models.ProgramacaoModel;
import br.ufg.cinecult.models.UsuarioModel;
import jakarta.validation.constraints.NotBlank;

public record IngressoRecordDto(@NotBlank ProgramacaoModel programacaoModel, @NotBlank FilmeModel filmeModel, @NotBlank
                                UsuarioModel usuarioModel, @NotBlank String assento, @NotBlank Double valor, @NotBlank
                                FormaPagamento formaPagamento) {
}
