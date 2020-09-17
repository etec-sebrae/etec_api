package br.sp.gov.etec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.sp.gov.etec.dto.EscolaDto;
import br.sp.gov.etec.entity.Escola;
import br.sp.gov.etec.service.EscolaService;
import br.sp.gov.etec.util.Mensagem;

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
	public ResponseEntity<?> listarEscola(){		
		List<Escola> escolas = service.listarEscola();	
		return ResponseEntity.status(HttpStatus.OK).body(escolas);
	}	
	
	@GetMapping("/{id}")
	public ResponseEntity<?> consultarEscola(@PathVariable(value = "id") long id){		
		Escola escola = service.procurarPorIdEscola(id);
		return ResponseEntity.status(HttpStatus.OK).body(escola);
	}	
	
	
	@PutMapping
	public ResponseEntity<?> atualizarEscola(@RequestBody Escola escola){		
		Escola retorno = service.atualizarEscola(escola);		
		return ResponseEntity.status(HttpStatus.OK).body(retorno);
	}
	

	@DeleteMapping
	public ResponseEntity<?> deletarEscola(@RequestBody Escola escola){
		service.deletarEscola(escola);
		Mensagem msg = new Mensagem();
		msg.setCodRetorno(HttpStatus.OK.toString());
		msg.setMsg(escola.toString());
		return  ResponseEntity.status(HttpStatus.OK).body(msg);
	}
	//delete escola

}
