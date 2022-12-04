package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {

   @Mock
   private Burger burger;

   @Mock
   private Bun bun;

   @Mock
   private Ingredient ingredient;


   //тест выбора булочки
   @Test
   public void setBun() {
       burger.setBuns(bun);
       Mockito.verify(burger).setBuns(bun);
   }

   //тест добавления ингридиентов
   @Test
   public void addIngredientTest() {
      burger.addIngredient(ingredient);
      Mockito.verify(burger).addIngredient(ingredient);
   }

   //тест удаление ингридиентов
   @Test
   public void removeIngredientTest() {
      burger.removeIngredient(0);
      Mockito.verify(burger).removeIngredient(0);
   }

   //тест перемещения ингридиентов
   @Test
   public void moveIngredientTest() {
      burger.moveIngredient(0, 1);
      Mockito.verify(burger).moveIngredient(0, 1);
   }

   //тест правильного рассчета цены
   @Test
   public void getPriceTest() {
      Burger burger = new Burger();
      burger.setBuns(bun);
      burger.ingredients.add(ingredient);
      Mockito.when(bun.getPrice()).thenReturn(25f);
      Mockito.when(ingredient.getPrice()).thenReturn(25f);
      float actual = burger.getPrice();
      assertThat(actual, equalTo(75f));
   }

}
