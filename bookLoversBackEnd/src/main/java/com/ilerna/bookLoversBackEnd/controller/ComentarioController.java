package com.ilerna.bookLoversBackEnd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ilerna.bookLoversBackEnd.model.Comentario;
import com.ilerna.bookLoversBackEnd.service.ComentarioService;

@RestController
@RequestMapping("/comments")
public class ComentarioController {

	@Autowired
	ComentarioService comentarioService;
	
	@GetMapping
	public ResponseEntity<List<Comentario>> listaComentarios(Integer idLibro){
		
		return null;
		
	}
	
	
}
