package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(Parameterized.class)
public class IngredientTypeTest {

    private final IngredientType ingredientType;

    public IngredientTypeTest(IngredientType ingredientType) {
        this.ingredientType = ingredientType;
    }

    @Parameterized.Parameters
    public static Object [][] getIngredientTypes() {
        return new Object [][] {
                {IngredientType.FILLING},
                {IngredientType.SAUCE},
        };
    }

    @Test
    public void getIngredientType() {
        Ingredient ingredient = new Ingredient(ingredientType, "Burger", 100f);
        IngredientType actual = ingredient.getType();
        assertThat(actual, equalTo(ingredientType));
    }

}
