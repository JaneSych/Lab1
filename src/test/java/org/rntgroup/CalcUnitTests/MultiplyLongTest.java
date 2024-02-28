package org.rntgroup.CalcUnitTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiplyLongTest extends BaseTest {

    @DataProvider(name = "valuesForMultiplyLongTest")
    private Object[][] valuesForMultiply() {
        return new Object[][]{
                {0, 0, 0},
                {0, -1, -0},
                {10, 15, 150},
                {-11, 2, -22},
                {-13, -10, 130}
        };
    }

    @Test(description = "Unit Multiply Long Test",
            dataProvider = "valuesForMultiplyLongTest",
            groups = "MultiplyTest")
    public void unitMultiplyLongTest(long num1, long num2, long expValue) {
        long result = calculator.mult(num1, num2);
        Assert.assertEquals(result, expValue, "Result is not correct!");
    }
}
