package br.sp.gov.etec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.sp.gov.etec.entity.Escola;

public interface EscolaRepository extends JpaRepository<Escola, Long> {

}
