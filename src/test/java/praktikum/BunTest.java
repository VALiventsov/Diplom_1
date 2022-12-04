package praktikum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class BunTest {

    private String name;
    private float price;
    public BunTest (String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters
    public static Object[][] getData(){
        return  new Object[][]{
                {"Big black bun for real men",666},
                {"Unknown bun N-200i!", 300.6f},
                {null,-30},
                {"Булка булочка", 3557856556556584f},
                {"",0}
        };
    }

    private Bun bun;
    @Before
    public void setUp(){
        bun = new Bun(name, price);
    }

    //тест возвращения имени булочки
    @Test
    public void getNameBunTest() {
        String actual = bun.getName();
        Assert.assertEquals("Name is incorrect", name, actual);
    }

    //тест возвращения цены булочки
    @Test
    public void getPriseBunTest() {
        Float actual = bun.getPrice();
        Assert.assertEquals("Price is incorrect", price, actual, 0);
    }


}
