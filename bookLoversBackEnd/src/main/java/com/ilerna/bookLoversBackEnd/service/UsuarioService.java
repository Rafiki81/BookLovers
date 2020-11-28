package com.ilerna.bookLoversBackEnd.service;

import java.util.List;

import com.ilerna.bookLoversBackEnd.model.Usuario;

public interface UsuarioService {
	
	public Usuario creaUsuario(Usuario usuario);
	
	public List<Usuario> listaUsuarios();
	
	public Usuario modificaUsuario(int id);
	
	public void borraUsuario(int id);
	
	public boolean validaUsuario(Usuario usuario);

}
