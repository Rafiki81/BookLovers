package com.ilerna.bookLoversBackEnd.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "COMENTARIOS")
public class Comentario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne(cascade = {CascadeType.REFRESH})
	@JoinColumn(name="ID")
	private Usuario usuario;
	
	@ManyToOne(cascade = {CascadeType.REFRESH})
	@JoinColumn(name="ID")
	private Libro libro;
	
	private String texto;
	private int rating;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	
	public Comentario() {
		
	}

	public Comentario(int id, Usuario usuario, Libro libro, String texto, int rating, Date fecha) {
		this.id = id;
		this.usuario = usuario;
		this.libro = libro;
		this.texto = texto;
		this.rating = rating;
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
