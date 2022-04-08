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

        Recipe recipe1 = new Recipe("Creamy Chicken Pasta","400g rigatoni pasta, 400g chicken breasts, 420g tin condensed cream of chicken soup, 300g sour cream and 2 cups grated cheese", 45.0, "Preheat oven to 180C.\n" +
                "Cook chicken in a medium frypan until just cooked through.\n" +
                "In a large bowl, whisk together soup and sour cream. Add chicken and drained pasta and stir to combine.Bake for 30 minutes until golden.", 8 );

        Recipe recipe2 = new Recipe("Basic Biscuits","500 g butter , 12 tbs caster sugar large, 4 1/2 cup plain flour, 395 g condensed milk unsweetened", 20.0, "Cream butter and sugar, add milk, then slowly add flour.\n" +
                "Mix well.\n" +
                "Shape mixture into balls, flatten slightly with a fork and place onto a greased tray.\n" +
                "Bake at 180C for approximately 10 minutes until browned.tes until golden.", 7 );

        Recipe recipe3 = new Recipe("Vanilla French Toast","4 large eggs, lightly beaten, 1 cup 2% milk, 2 tablespoons sugar, 2 teaspoons vanilla extract, 1/8 teaspoon salt, 12 slices day-old sandwich breadntil golden.",
                15.0, "In a shallow dish, whisk together the first 5 ingredients. Preheat a greased griddle over medium heat. Dip bread in egg mixture, allowing to soak 30 seconds on each side. Cook on griddle until golden brown on both sides. Serve with toppings as desired", 9 );

        Recipe recipe4 = new Recipe("Pesto","1 cup tightly packed fresh basil or cilantro leaves, 1 cup tightly packed fresh parsley leaves, 1 to 2 garlic cloves, 1/2 cup olive oil, 1/2 cup grated Parmesan cheese, 1/4 teaspoon salt.", 10.0, "In a food processor, puree all ingredients. Refrigerate for several weeks or freeze in a tightly covered container. Toss a few tablespoons pesto with hot cooked pasta.", 8 );

        Recipe recipe5 = new Recipe("Bean & Cheese Quesadillas","1 can (16 ounces) refried beans, 1/2 cup canned petite diced tomatoes, 2 green onions, chopped, 12 flour tortillas (8 inches), 2 cups shredded cheddar cheese", 30.0, " In a small bowl, mix beans, tomatoes and green onions. Spread half the tortillas with bean mixture. Sprinkle with cheese; top with remaining tortillas.\n" +
                "Heat a griddle over medium heat. Cook until golden brown and cheese is melted", 7 );

        Recipe recipe6 = new Recipe("Crepes","1 1/2 cups plain flour, 1 egg, 3 tbs sugar, 1 cup milk and 1/3 cup soda", 35.0, "Add flour and sugar in a bowl, mix in egg and a bit of milk and soda water.\n" +
                "Stir and keep adding milk and some soda water until batter is runny.\n" +
                "Spoon a thin layer of batter into the fry pan and turn over wehn golden\n" +
                "Add topping", 9 );



        recipesRepository.save(recipe1);
        recipesRepository.save(recipe2);
        recipesRepository.save(recipe3);
        recipesRepository.save(recipe4);
        recipesRepository.save(recipe5);
        recipesRepository.save(recipe6);



    }
}
