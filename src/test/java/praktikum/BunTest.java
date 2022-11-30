package praktikum;

import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;

public class BunTest {

    Bun bun = new Bun("black", 1.99f);

    @Test
    public void getNameBunTest() {
        String expected = "black";
        String actual = bun.getName();
        Assert.assertEquals("Name is incorrect", expected, actual);
    }

    @Test
    public void getPriseBunTest() {
        float expected = 1.99f;
        float actual = bun.getPrice();
        float delta = 0.0f;
        Assert.assertEquals("Price is incorrect", expected, actual, delta);
    }


}
