package com.example.biblioteca.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.biblioteca.entity.Libros;
import com.example.biblioteca.service.impl.ServiceImplLibros;

@RestController
@RequestMapping("/libros")
@CrossOrigin(origins="*")
public class ControllerLibro {
	@Autowired
	@Qualifier("librosServiceImpl")
	private ServiceImplLibros serviceImplLibros;
	
	@GetMapping(path="/list/",produces= {"application/json"})
	public List<Libros> ListLibros(){
		return serviceImplLibros.listAllLibros();
	}
	
	@GetMapping(path="/get/{id}",produces= {"application/json"})
	public Optional<Libros> getLibros(@PathVariable String id){
		return serviceImplLibros.findByIdLibros(id);
	}
	
	@PutMapping(path="/update/",produces= {"application/json"})
	public Libros updateLibros(@RequestBody Libros libros){
		return serviceImplLibros.updateLibros(libros);
	}
} 
