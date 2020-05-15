package com.guiconsultoria.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guiconsultoria.app.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
	
}
