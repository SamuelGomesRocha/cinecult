package br.ufg.cinecult.dtos;

import br.ufg.cinecult.models.FilmeModel;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;

import java.util.UUID;

public record ProgramacaoRecordDto(@NotBlank String valor, @NotBlank String dataExibicao, @NotBlank String horarioExibicao) {
}
