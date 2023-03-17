package model;

import exceptions.NegativeWeightException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IngredientTest {

    private Ingredient ingredient;

    public void setupStage1 (){

        ingredient = new Ingredient("Tomate",245 );

    }

    @Test
    public void addWeightTest (){

        setupStage1();

        this.ingredient.addWeight(54);

        assertEquals(299,this.ingredient.getWeight());
    }

    @Test
    public void addNegativeWeightTest (){

        setupStage1();

        boolean result = false;

        try {

            this.ingredient.addWeight(-100);

        }catch (NegativeWeightException ex){

            result = true;
        }
        assertTrue(result);
        assertEquals(245,this.ingredient.getWeight());
    }

    @Test
    public void removeWeightTest (){

        setupStage1();

        this.ingredient.removeWeight(45);

        assertEquals(200, this.ingredient.getWeight());
    }

    @Test
    public void removeNegativeWeightTest (){

        setupStage1();

        boolean result = false;

        try {

            this.ingredient.removeWeight(-100);

        } catch (NegativeWeightException ex){

            result = true;

        }
        assertTrue(result);
        assertEquals(245, this.ingredient.getWeight());
    }
}
