package br.ufg.cinecult.repositories;

import br.ufg.cinecult.models.ProgramacaoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProgramacaoRepository extends JpaRepository<ProgramacaoModel, UUID> {
}
