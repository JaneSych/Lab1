package org.rntgroup.CalcUnitTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowTest extends BaseTest {

    @DataProvider(name = "valuesForPow")
    private Object[][] valuesForPow() {
        return new Object[][]{
                {0, 0, 1},
                {0, 5, 0},
                {3, 0, 1},
                {1, 3.2, 1},
                {5, 1, 5},
                {2, 8, 256},
                {0.8, -1, 1.25},
                {1.5, 5.1, 7.59375},
                {2, -2, 0.25}
        };
    }

    @Test(description = "Unit Pow Test",
            dataProvider = "valuesForPow")
    public void unitPowTest(double num1, double num2, double expValue) {
        double result = calculator.pow(num1, num2);
        Assert.assertEquals(result, expValue, "Result is not correct!");
    }

    @Test(description = "Unit Negative Pow double Test")
    public void unitNegativePowDoubleTest() {
        boolean isNan = Double.isNaN(calculator.pow(-1, 0.5));
        Assert.assertTrue(isNan);
    }
}
