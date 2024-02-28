package org.rntgroup.CalcUnitTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SqrtTest extends BaseTest {

    @DataProvider(name = "valuesForSqrt")
    private Object[][] valuesForSqrt() {
        return new Object[][]{
                {0, 0},
                {1, 1},
                {9, 3},
                {256, 16},
                {3.14, 1.772004514666935}
        };
    }

    @Test(description = "Unit Sqrt Test",
            dataProvider = "valuesForSqrt")
    public void unitSqrtTest(double num, double expValue) {
        double result = calculator.sqrt(num);
        Assert.assertEquals(result, expValue, "Result is not correct!");
    }

    @Test(description = "Unit Sqrt Negative Test")
    public void unitNegativePowDoubleTest() {
        Assert.assertThrows(ArithmeticException.class, () -> { calculator.sqrt(-10);});
    }
}
