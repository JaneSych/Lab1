package org.rntgroup.CalcUnitTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivDoubleTest extends BaseTest {

    @DataProvider(name = "valuesForDivDouble")
    private Object[][] valuesForDiv() {
        return new Object[][]{
                {0, -1, -0.0},
                {15.10, 10, 1.51},
                {-2.04, 2.04, -1.0},
                {-30.0, -3.0, 10.0}
        };
    }

    @Test(description = "Unit Div Double Test",
            dataProvider = "valuesForDivDouble",
            groups = "DivTest")
    public void unitDivDoubleTest(double num1, double num2, double expValue) {
        double result = calculator.div(num1, num2);
        Assert.assertEquals(result, expValue, "Result is not correct!");
    }


    @Test(description = "Unit Div by Zero Double Test",
            groups = "DivTest")
    public void unitDivByZeroDoubleTest() {
        Assert.assertThrows(ArithmeticException.class, () -> { calculator.div(10.10, 0);});
    }
}
