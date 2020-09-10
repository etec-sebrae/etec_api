package br.sp.gov.etec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.sp.gov.etec.dto.EscolaDto;
import br.sp.gov.etec.entity.Escola;
import br.sp.gov.etec.repository.EscolaRepository;

@Service
public class EscolaService {
	
	@Autowired
	EscolaRepository repository;
	
	public Escola cadastrarEscola(EscolaDto dto){		
		Escola escola = repository.save(dto.toEntityEscola());		
		return escola;		
	}
	
	public List<Escola> listarEscola(){
		List<Escola> escolas = repository.findAll();
		return escolas;
	}

}
