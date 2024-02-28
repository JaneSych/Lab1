package org.rntgroup.CalcUnitTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiplyDoubleTest extends BaseTest {

    @DataProvider(name = "valuesForMultiplyDoubleTest")
    private Object[][] valuesForMultiply() {
        return new Object[][]{
                {0.0, 0.0, 0.0},
                {0.0, -1, -0.0},
                {10, 15.3, 153},
                {10.10, 15.3, 154.53},
                {-13.20, -10.1, 133.32}
        };
    }

    @Test(description = "Unit Multiply Double Test",
            dataProvider = "valuesForMultiplyDoubleTest",
            groups = "MultiplyTest")
    public void unitMultiplyDoubleTest(double num1, double num2, double expValue) {
        double result = calculator.mult(num1, num2);
        Assert.assertEquals(result, expValue, "Result is not correct!");
    }
}
