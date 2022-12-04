package praktikum;
import org.junit.Assert;
import org.junit.Test;

public class BurgerReceiptTest {

    //Тест на возврат рецепта
    @Test
    public void getReceiptTest() {
       Burger burger = new Burger();
       Bun bun = new Bun ("black", 10);
       Ingredient ingredient = new Ingredient(IngredientType.FILLING,"beef", 100);
       burger.setBuns(bun);
       burger.ingredients.add(ingredient);
       String actual = burger.getReceipt();
       String expected = "(==== black ====)\r\n= filling beef =\r\n(==== black ====)\r\n\r\nPrice: 120,000000\r\n";
       Assert.assertEquals ("receipt is incorrect", actual, expected);
   }

}
