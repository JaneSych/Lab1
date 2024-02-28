package org.rntgroup.CalcUnitTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivLongTest extends BaseTest {

    @DataProvider(name = "valuesForDivLong")
    private Object[][] valuesForDiv() {
        return new Object[][]{
                {0, -1, 0},
                {15, 15, 1},
                {-10, 2, -5},
                {30, -15, -2}
        };
    }

    @Test(description = "Unit Div Long Test",
            dataProvider = "valuesForDivLong",
            groups = "DivTest")
    public void unitDivLongTest(long num1, long num2, long expValue) {
        long result = calculator.div(num1, num2);
        Assert.assertEquals(result, expValue, "Result is not correct!");
    }


    @Test(description = "Unit Div by Zero Long Test",
            groups = "DivTest")
    public void unitDivByZeroLongTest() {
        Assert.assertThrows(ArithmeticException.class, () -> { calculator.div(100, 0);});
    }
}
