package com.example.biblioteca.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.biblioteca.entity.Libros;

@Repository("librosRepository")
public interface RepositoryLibros extends CrudRepository<Libros,Long>{
	
}
