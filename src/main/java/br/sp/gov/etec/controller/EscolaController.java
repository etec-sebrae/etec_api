package br.sp.gov.etec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.sp.gov.etec.dto.EscolaDto;
import br.sp.gov.etec.entity.Escola;
import br.sp.gov.etec.service.EscolaService;

@Controller
@RequestMapping("/api/escola")
public class EscolaController {
	
	@Autowired
	EscolaService service;
	
	
	@PostMapping
	public ResponseEntity<?> cadastrarEscola(@RequestBody EscolaDto dto){		
		Escola escola = service.cadastrarEscola(dto);		
		return ResponseEntity.status(HttpStatus.OK).body(escola);
	}	
	
	@GetMapping
	public ResponseEntity<?> listaEscola(){		
		List<Escola> escolas = service.listarEscola();	
		return ResponseEntity.status(HttpStatus.OK).body(escolas);
	}	
	
	

}
