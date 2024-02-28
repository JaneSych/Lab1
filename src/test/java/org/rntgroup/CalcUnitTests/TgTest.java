package org.rntgroup.CalcUnitTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TgTest extends BaseTest {

    @DataProvider(name = "valuesForTg")
    private Object[][] valuesForTg() {
        return new Object[][]{
                {0, 0},
                {30, 0.5773502691896257},
                {45, 1},
                {60, 1.7320508075688767},
                {180, 0},
                {360, 0},
                {-180, 0},
                {1, 0.017455064928217585},
                {187, 0.1227845609029044}
        };
    }

    @Test(description = "Unit Tg Test",
            dataProvider = "valuesForTg")
    public void unitTgTest(double angle, double expValue) {
        double result = calculator.tg(Math.toRadians(angle));
        Assert.assertEquals(result, expValue, "Result is not correct!");
    }

    @DataProvider(name = "valuesForTgNegative")
    private Object[][] valuesForTgNegative() {
        return new Object[][]{
                {90},
                {270},
                {-90}
        };
    }

    @Test(description = "Unit Tg Negative  Test",
            dataProvider = "valuesForTgNegative")
    public void unitTgNegativeTest(double angle) {
        Assert.assertThrows(ArithmeticException.class, () -> { calculator.tg(Math.toRadians(angle));});
    }

}
