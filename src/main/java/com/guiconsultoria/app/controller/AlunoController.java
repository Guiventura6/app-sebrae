package com.guiconsultoria.app.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guiconsultoria.app.entity.Aluno;
import com.guiconsultoria.app.repository.AlunoRepository;

@RequestMapping(value = "/alunos")
public class AlunoController {

	@Autowired
	AlunoRepository alunoRepository;
	
private static final Logger	log = LoggerFactory.getLogger(CursoController.class);
	
	@PostMapping
	@RequestMapping(value = "/cadastrar")
	public void cadastroAluno(@RequestBody Aluno aluno) {
		//Curso curso = this.transformeEntity(aluno);
		alunoRepository.save(aluno);
	}

	/*private Curso transformeEntity(CursoDto cursoDto) {
		Curso c = new Curso();
		c.setNome(cursoDto.getNome());
		c.setDescricao(cursoDto.getDescricao());
		return c;

	}*/
	
	@GetMapping(value = "/listarAlunos")
	public ResponseEntity <List<Aluno>> listarAlunos(){
		List<Aluno> list = this.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	public List<Aluno> findAll() {
		log.info("listando todos os Alunos");
		List<Aluno> alunos = alunoRepository.findAll();
		
		for(Aluno c: alunos) {
			 log.debug("Curso: ", c.toString());
		}
		return alunos;
	}
}
