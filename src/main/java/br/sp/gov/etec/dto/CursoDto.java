package br.sp.gov.etec.dto;

import java.io.Serializable;

import br.sp.gov.etec.entity.Curso;

public class CursoDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8801099962146052104L;
	
	private String nome;
	private String descricao;
	private int status;
	private String codigo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public  Curso toEntityCurso() {		
		Curso curso = new Curso(nome,descricao, status, codigo);		
		return curso;		
	}
	
	
	
	
}
