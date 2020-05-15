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
import org.springframework.web.bind.annotation.RestController;

import com.guiconsultoria.app.dto.CursoDto;
import com.guiconsultoria.app.entity.Curso;
import com.guiconsultoria.app.repository.CursoRepository;

@RestController
@RequestMapping(value = "/cursos")
public class CursoController {

	@Autowired
	CursoRepository cursoRepository;
	
	private static final Logger	log = LoggerFactory.getLogger(CursoController.class);
	
	@PostMapping
	@RequestMapping(value = "/cadastrar")
	public void cadastroCurso(@RequestBody CursoDto cursoDto) {
		Curso curso = this.transformeEntity(cursoDto);
		
		cursoRepository.save(curso);
	}

	private Curso transformeEntity(CursoDto cursoDto) {
		Curso c = new Curso();
		c.setNome(cursoDto.getNome());
		c.setDescricao(cursoDto.getDescricao());
		return c;

	}
	
	@GetMapping(value = "/listarcursos")
	public ResponseEntity <List<Curso>> listarCursos(){
		List<Curso> list = this.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	public List<Curso> findAll() {
		log.info("listando todos os cursos");
		List<Curso> cursos = cursoRepository.findAll();
		
		for(Curso c: cursos) {
			 log.debug("Curso: ", c.toString());
		}
		return  cursos;
	}
}
