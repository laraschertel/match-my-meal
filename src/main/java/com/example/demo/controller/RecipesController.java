package com.example.demo.controller;

import com.example.demo.model.Recipe;
import com.example.demo.repository.RecipesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class RecipesController {
    @Autowired
    RecipesRepository recipesRepository;
    @GetMapping("/recipeList")
    public List<Recipe> getAllRecipes() {
		return recipesRepository.findAll();
    }


    @PostMapping("/addRecipe")
    public Recipe createRecipe(@RequestBody Recipe recipe) {
        Recipe newRecipe = new Recipe(recipe.getName(), recipe.getIngredients(), recipe.getPreptime(), recipe.getInstructions(), recipe.getNote());

        return recipesRepository.save(newRecipe);
    }

    @PutMapping("/recipeList/{id}")
    public void putRecipe(@PathVariable("id") long id, @RequestBody Recipe recipe){
        this.recipesRepository.findById(id).map(recipeEntry -> {
            recipeEntry.setName(recipe.getName());
            recipeEntry.setIngredients(recipe.getIngredients());
            recipeEntry.setPreptime(recipe.getPreptime());
            recipeEntry.setInstructions(recipe.getInstructions());
            recipeEntry.setNote(recipe.getNote());
            return recipesRepository.save(recipeEntry);
        });
    }

    @PatchMapping("/recipeList/{id}")
    public void updateRecipeNote(@PathVariable("id") long id, @RequestBody Recipe recipe) {
       this.recipesRepository.findById(id).map(recipeUpdate -> {
           recipeUpdate.setNote(recipe.getNote());
           return recipesRepository.save(recipeUpdate);
       });
    }
    @DeleteMapping("/recipeList/{id}")
    public void deleteRecipe(@PathVariable("id") long id) {
        this.recipesRepository.deleteById(id);
    }

}