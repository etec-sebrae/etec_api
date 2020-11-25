package br.sp.gov.etec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.sp.gov.etec.dto.CursoDto;
import br.sp.gov.etec.entity.Curso;
import br.sp.gov.etec.repository.CursoRepository;

@Service
public class CursoService {	

	@Autowired
	CursoRepository repository;
	
	public Curso cadastrarCurso(CursoDto dto) {		
		Curso curso = repository.save(dto.toEntityCurso());		
		return curso;		
	}
	
	public List<Curso> listaCursos() {		
		List<Curso> cursos = repository.findAll();
		return cursos;		
	}
	
	public Curso procurarPorIdCurso(long id){		
		Curso curso = repository.findById(id);		
		return curso;			
	}
	
	public void deletarCurso(Curso curso) {
		repository.delete(curso);
	}
	
	public Curso atualizarEscola(Curso curso) {		
		Curso retorno = repository.save(curso);	
		return retorno;		
	}
}
