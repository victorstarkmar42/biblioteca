package com.example.biblioteca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.biblioteca.entity.Libros;
import com.example.biblioteca.repository.RepositoryLibros;
import java.util.List;
@SpringBootApplication
public class BibliotecaApplication implements CommandLineRunner{

	@Autowired
	private RepositoryLibros repositoryLibros;
	
	public static void main(String[] args) {
		SpringApplication.run(BibliotecaApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		List<Libros> listLibros = (List<Libros>) repositoryLibros.findAll();
		listLibros.forEach(System.out::println);
	}

}
