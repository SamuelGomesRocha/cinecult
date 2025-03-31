package br.ufg.cinecult.dtos;

import br.ufg.cinecult.models.FilmeModel;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.mapping.List;

import java.time.LocalDateTime;
import java.util.UUID;

public record ProgramacaoRecordDto(String valor, List datasExibicao, Integer quantidade) {
}
