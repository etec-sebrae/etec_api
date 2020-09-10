package br.sp.gov.etec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.sp.gov.etec.entity.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

}
