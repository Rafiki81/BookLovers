package com.ilerna.bookLoversBackEnd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ilerna.bookLoversBackEnd.model.Usuario;
import com.ilerna.bookLoversBackEnd.repository.UsuarioRepository;
import com.ilerna.bookLoversBackEnd.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	UsuarioRepository repository;

	@Override
	public Usuario creaUsuario(Usuario usuario) {
		
		return repository.save(usuario);
		
	}

	@Override
	public List<Usuario> listaUsuarios() {
		
		return repository.findAll();
		
	}

	@Override
	public Usuario modificaUsuario(int id) {
		
		return null;
	}

	@Override
	public void borraUsuario(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean validaUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}

}
