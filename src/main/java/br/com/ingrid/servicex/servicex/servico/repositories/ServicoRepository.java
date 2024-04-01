package br.com.ingrid.servicex.servicex.servico.repositories;

import br.com.ingrid.servicex.servicex.servico.domain.Servico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}