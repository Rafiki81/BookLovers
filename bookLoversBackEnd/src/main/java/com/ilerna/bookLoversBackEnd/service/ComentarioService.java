package com.ilerna.bookLoversBackEnd.service;

import java.util.List;

import com.ilerna.bookLoversBackEnd.model.Comentario;

public interface ComentarioService {
	
	public Comentario creaLibro(Comentario comentario);
	
	public List<Comentario> listaComentarios();
	
	public Comentario modificaLibro(int id);
	
	public void borraLibro(int id);

}
