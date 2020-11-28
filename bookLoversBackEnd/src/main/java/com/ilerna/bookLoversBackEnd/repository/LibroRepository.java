package com.ilerna.bookLoversBackEnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ilerna.bookLoversBackEnd.model.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer>{

}
