package com.guiconsultoria.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_aluno")
public class Aluno implements Serializable {
	private static final long serialVersionUID = -2508272598242783067L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_aluno", nullable = false)
	private Long id;

	@Column(name = "nome", nullable = false)
	private String nome;

	@Column(name = "rg", nullable = false)
	private String rg;

	@Column(name = "cpf", nullable = false)
	private String cpf;

	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "data_nasc", nullable = false)
	private Integer data_nasc;

	//@OneToOne
	//@JoinColumn(name = "id_curso") *TESTAR*
	@Column(name = "id_curso", nullable = false)
	private Curso curso;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public Integer getData_nasc() {
		return data_nasc;
	}

	public void setData_nasc(Integer data_nasc) {
		this.data_nasc = data_nasc;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + ", email=" + email
				+ ", data_nasc=" + data_nasc + ", curso=" + curso + "]";
	}
}
