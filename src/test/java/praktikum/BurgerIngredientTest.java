package praktikum;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static praktikum.IngredientType.SAUCE;

@RunWith(MockitoJUnitRunner.class)
public class BurgerIngredientTest {

    Burger burger;

    @Mock
    private Ingredient ingredient;

    @Before
    public void setUp() {
        burger = new Burger();
        burger.addIngredient(new Ingredient(SAUCE, "hot sauce", 100));
        burger.addIngredient(new Ingredient(SAUCE, "sour cream", 200));
        burger.addIngredient(new Ingredient(IngredientType.FILLING, "cutlet", 300));
        burger.addIngredient(new Ingredient(IngredientType.FILLING, "cutlet", 100));
        burger.addIngredient(new Ingredient(IngredientType.FILLING, "dinosaur", 200));
        burger.addIngredient(new Ingredient(IngredientType.FILLING, "sausage", 300));

    }

    //тест на добавление ингридиентов
    @Test
    public void addIngredientTest() {
        int expected = 6;
        int actual = burger.ingredients.size();
        String actualName = burger.ingredients.get(2).name;
        Float actualPrice = burger.ingredients.get(0).price;
        IngredientType actualType = burger.ingredients.get(1).type;
        assertEquals(expected, actual);
        assertEquals("Name is incorrect", "cutlet", actualName);
        assertEquals("Price is incorrect", 100, actualPrice, 3);
        assertEquals("Type is incorrect", SAUCE, actualType);
    }

    //тест на удаление ингридиентов
    @Test
    public void RemoveIngredientTest() {
        burger.removeIngredient(1);
        burger.removeIngredient(4);
        int expected = 4;
        int actual = burger.ingredients.size();
        assertEquals("Ingredients list size is incorrect", expected, actual);
    }

    //тест на перемещение ингридиенов
    @Test
    public void MoveIngredientTest() {
        String expectedName = burger.ingredients.get(1).name;
        Float expectedPrice = burger.ingredients.get(3).price;
        IngredientType expectedType = burger.ingredients.get(0).type;
        burger.moveIngredient(1, 5);
        burger.moveIngredient(0, 3);
        String actualName = burger.ingredients.get(5).name;
        Float actualPrice = burger.ingredients.get(1).price;
        IngredientType actualType = burger.ingredients.get(3).type;
        assertEquals("It's not sour cream", expectedName, actualName);
        assertEquals("It's not 100", expectedPrice, actualPrice);
        assertEquals("", expectedType, actualType);

    }
}