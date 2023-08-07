package com.example.biblioteca.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.biblioteca.entity.Libros;
import com.example.biblioteca.repository.RepositoryLibros;
import com.example.biblioteca.service.ServiceLibros;

import jakarta.transaction.Transactional;

@Service("librosServiceImpl")
@Transactional
public class ServiceImplLibros implements ServiceLibros{
	
	@Autowired
	@Qualifier("librosRepository")
	private RepositoryLibros repositoryLibros;

	@Override
	public List<Libros> listAllLibros() {
		return (List<Libros>) repositoryLibros.findAll();
	}

	@Override
	public Optional<Libros> findByIdLibros(Long id) {
		return repositoryLibros.findById(id);
	}

	@Override
	public Libros updateLibros(Libros libros) {
		return repositoryLibros.save(libros);
	}
	
	@Override
	public int removeLibros(int id) {
		return repositoryLibros.deleteByIdlibro(id);
	}
}
