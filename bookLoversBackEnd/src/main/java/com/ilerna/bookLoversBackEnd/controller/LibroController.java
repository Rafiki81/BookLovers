package com.ilerna.bookLoversBackEnd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ilerna.bookLoversBackEnd.model.Libro;
import com.ilerna.bookLoversBackEnd.service.LibroService;


@RestController
@RequestMapping("/books")
public class LibroController {

	@Autowired
	LibroService libroService;
	
	@GetMapping
	public ResponseEntity<List<Libro>> listLibros() {
		
		return new ResponseEntity<>(libroService.listaLibros(), HttpStatus.OK);
		
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Libro> getLibro(@PathVariable Integer id) {
		
		return new ResponseEntity<>(libroService.obtenerLibro(id), HttpStatus.OK);
		
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Integer> deleteLibro(@PathVariable Integer id){
		
		return new ResponseEntity<>(id, HttpStatus.OK);
		
	}
	
	@PostMapping
	public ResponseEntity<Libro> createLibro(Libro libro) {
		
		return new ResponseEntity<>(libroService.creaLibro(libro), HttpStatus.OK);
		
	}
	
	@PutMapping(path = "/{id}")
	public ResponseEntity<Libro> modifyLibro(Libro libro) {
		
		return new ResponseEntity<>(libroService.modificaLibro(libro), HttpStatus.OK);
		
	}
	
	
	
	
}
