package br.ufg.cinecult.repositories;

import br.ufg.cinecult.models.IngressoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IngressoRepository extends JpaRepository<IngressoModel, UUID> {

}
