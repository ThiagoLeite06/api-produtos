package com.thiagoleite.justAnotherApp;

import com.thiagoleite.justAnotherApp.entities.Category;
import com.thiagoleite.justAnotherApp.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class justAnotherAppApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(justAnotherAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(1L, "Eletronics");
		Category cat2 = new Category(2L, "Books");

		categoryRepository.save(cat1);
		categoryRepository.save(cat2);
	}
}