package com.example.demo.model;
import javax.persistence.*;


@Entity
@Table(name = "recipes")
public class Recipe{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String ingredients;
    private Double preptime;
    private String instructions;
    private int note;
    public Recipe() {
    }
    public Recipe(String name, String ingredients, Double time, String instructions, int note) {
        this.name = name;
        this.ingredients = ingredients;
        this.preptime = time;
        this.instructions = instructions;
        this.note = note;
    }


    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getIngredients() {
        return ingredients;
    }
    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public Double getPreptime() {
        return preptime;
    }
    public void setPreptime(Double time) {
        this.preptime = time;
    }
    public String getInstructions() {
        return instructions;
    }
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
    public int getNote() {
        return note;
    }
    public void setNote(int note) {
        this.note = note;
    }


        @Override
    public String toString() {
        return "Recipe [id=" + id + ", name=" + name + ", ingredients=" + ingredients + ", prep. time=" + preptime + ", instructions=" + instructions + ", note=" + note + "]";
    }
}
