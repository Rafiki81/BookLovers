package com.ilerna.bookLoversBackEnd.service;

import java.util.List;

import com.ilerna.bookLoversBackEnd.model.Libro;

public interface LibroService {
	
	public Libro creaLibro(Libro libro);
	
	public Libro obtenerLibro(int id);
	
	public List<Libro> listaLibros();
	
	public Libro modificaLibro(Libro libro);
	
	public void borraLibro(int id);

}
