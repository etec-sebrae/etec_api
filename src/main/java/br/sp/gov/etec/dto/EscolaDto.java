package br.sp.gov.etec.dto;

import java.io.Serializable;

import br.sp.gov.etec.entity.Escola;

public class EscolaDto implements Serializable {

	private static final long serialVersionUID = -4133830413107916879L;

	private String nome;
	private String email;
	private String codigo;
	private int status;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	public Escola toEntityEscola() {		
		Escola  escola  =  new Escola(nome,email,codigo,status);		
		return escola;
	}
	

}
