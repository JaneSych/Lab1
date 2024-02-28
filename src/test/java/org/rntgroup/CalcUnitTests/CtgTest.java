package org.rntgroup.CalcUnitTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CtgTest extends BaseTest {

    @DataProvider(name = "valuesForCtg")
    private Object[][] valuesForCtg() {
        return new Object[][]{
                {30, 1.7320508075688767},
                {45, 1},
                {60, 0.5773502691896257},
                {90, 0},
                {270, 0},
                {-90, 0},
                {1, 57.28996163075943},
                {187, 8.144346427974606}
        };
    }

    @Test(description = "Unit Ctg Test",
            dataProvider = "valuesForCtg")
    public void unitCtgTest(double angle, double expValue) {
        double result = calculator.ctg(Math.toRadians(angle));
        Assert.assertEquals(result, expValue, "Result is not correct!");
    }


    @DataProvider(name = "valuesForCtgNegative")
    private Object[][] valuesForCtgNegative() {
        return new Object[][]{
                {0},
                {180},
                {360}
        };
    }

    @Test(description = "Unit Ctg Negative  Test",
            dataProvider = "valuesForCtgNegative")
    public void unitCtgNegativeTest(double angle) {
        Assert.assertThrows(ArithmeticException.class, () -> { calculator.ctg(Math.toRadians(angle));});
    }

}
