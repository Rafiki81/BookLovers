package com.ilerna.bookLoversBackEnd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ilerna.bookLoversBackEnd.model.Libro;
import com.ilerna.bookLoversBackEnd.repository.LibroRepository;
import com.ilerna.bookLoversBackEnd.service.LibroService;

@Service
public class LibroServiceImpl implements LibroService{
	
	@Autowired
	LibroRepository libroRepository;

	@Override
	public Libro creaLibro(Libro libro) {
		return libroRepository.save(libro);
	}

	@Override
	public List<Libro> listaLibros() {
		return libroRepository.findAll();
	}

	@Override
	public Libro modificaLibro(Libro libro) {
	
		Libro libroSinModificar = libroRepository.
				findById(libro.getId()).
				orElse(null);
		
		libroSinModificar.setAutor(libro.getAutor());
		libroSinModificar.setIsbn(libro.getIsbn());
		libroSinModificar.setNotaMedia(libro.getNotaMedia());
		libroSinModificar.setTitulo(libro.getTitulo());
		
		return libroRepository.
				save(libroSinModificar);
	}

	@Override
	public void borraLibro(int id) {
		libroRepository.
		deleteById(id);
	}

	@Override
	public Libro obtenerLibro(int id) {
		return libroRepository.
				findById(id).
				orElse(null);
	}

}
