package praktikum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static praktikum.IngredientType.FILLING;

public class IngredientTest {

    String nameIngredient = "beef";
    float priceIngredient = 100f;
    IngredientType typeIngredient = FILLING;

    //тест стоимости начинки
    @Test
    public void getPriceTest() {
        Ingredient ingredient = new  Ingredient(typeIngredient, nameIngredient, priceIngredient);
        assertEquals(priceIngredient, ingredient.getPrice(), 0.00001);
    }

    //тест типа начинки
    @Test
    public void getNameTest() {
        Ingredient ingredient = new  Ingredient(typeIngredient, nameIngredient, priceIngredient);
        assertEquals(nameIngredient, ingredient.getName());
    }

    //тест типа начинки
    @Test
    public void getTypeTest () {
        Ingredient ingredient = new  Ingredient(typeIngredient, nameIngredient, priceIngredient);
        assertEquals(typeIngredient, ingredient.getType());
    }
}
