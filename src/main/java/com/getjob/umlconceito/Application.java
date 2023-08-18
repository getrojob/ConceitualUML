package com.getjob.umlconceito;

import com.getjob.umlconceito.domain.Categoria;
import com.getjob.umlconceito.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepository;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(1,"Eletronico");
		Categoria cat2 = new Categoria(2,"Informatica");
		Categoria cat3 = new Categoria(3,"Escritório");

		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
	}
}
