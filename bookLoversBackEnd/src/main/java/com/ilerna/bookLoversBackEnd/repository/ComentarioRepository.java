package com.ilerna.bookLoversBackEnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ilerna.bookLoversBackEnd.model.Comentario;

@Repository
public interface ComentarioRepository extends JpaRepository<Comentario, Integer>{

}
