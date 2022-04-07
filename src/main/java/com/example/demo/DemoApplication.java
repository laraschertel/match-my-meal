package com.example.demo;

import com.example.demo.model.Recipe;
import com.example.demo.repository.RecipesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.demo.controller", "com.example.demo.model", "com.example.demo.repository"})
public class DemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Autowired
    private RecipesRepository recipesRepository;

    @Override
    public void run(String... args) throws Exception {

        Recipe recipe1 = new Recipe("chocolate cake","chocolate, flour, eggs, butter", 70.0, "bake the chocolate cake", 8 );

        Recipe recipe2 = new Recipe("vanilla cake","vanilla, flour, eggs, butter", 60.0, "bake the vanilla cake", 7 );

        Recipe recipe3 = new Recipe("banana cake","banana, flour, butter", 45.0, "bake the banana cake", 9 );

    recipesRepository.save(recipe1);
    recipesRepository.save(recipe2);
    recipesRepository.save(recipe3);

    }
}
