package br.ufg.cinecult.dtos;

import br.ufg.cinecult.enums.FormaPagamento;
import br.ufg.cinecult.models.FilmeModel;
import br.ufg.cinecult.models.ProgramacaoModel;
import br.ufg.cinecult.models.UsuarioModel;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record IngressoRecordDto(FilmeModel filme, LocalDateTime dataExibicao,
                                FormaPagamento formaPagamento) {
}
