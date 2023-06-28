package com.example.biblioteca.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="libros")
public class Libros {
	@Id
	@Column(name="idlibro")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idlibro;
	private String autor;
	private String genero;
	private String precio;
	
	public int getIdlibro() {
		return idlibro;
	}
	public void setIdlibro(int idlibro) {
		this.idlibro = idlibro;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Libros [idlibro=" + idlibro + ", autor=" + autor + ", genero=" + genero + ", precio=" + precio + "]";
	}
	
	
}
