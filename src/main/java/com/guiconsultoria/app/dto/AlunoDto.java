package com.guiconsultoria.app.dto;

import java.io.Serializable;
import java.util.Date;

public class AlunoDto implements Serializable{
	private static final long serialVersionUID = 2627022493882160795L;

	private String nome;
	private String rg;
	private String cpf;
	private String email;
	private Date data_nasc;
	
	private Integer curso; 
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getData_nasc() {
		return data_nasc;
	}
	public void setData_nasc(Date data_nasc) {
		this.data_nasc = data_nasc;
	}
	
	public Integer getCurso() {
		return curso;
	}
	public void setCurso(Integer curso) {
		this.curso = curso;
	}
	
	@Override
	public String toString() {
		return "AlunoDto [nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + ", email=" + email + ", data_nasc="
				+ data_nasc + "]";
	}

}
