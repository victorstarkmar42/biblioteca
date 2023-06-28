package com.example.biblioteca.service;

import java.util.List;
import java.util.Optional;

import com.example.biblioteca.entity.Libros;

public interface ServiceLibros {
	public abstract List<Libros> listAllLibros();
	public abstract Optional<Libros> findByIdLibros(String id);
	public abstract Libros updateLibros(Libros libros);
}
