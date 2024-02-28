package org.rntgroup.CalcUnitTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsNegativeSignTest extends BaseTest {

    @DataProvider(name = "valuesForIsNegativeSign")
    private Object[][] valuesForIsNegativeSign() {
        return new Object[][]{
                {0, false},
                {1000, false},
                {-3, true},
        };
    }

    @Test(description = "Unit Is NegativeSign Test",
            dataProvider = "valuesForIsNegativeSign")
    public void unitIsNegativeSignTest(long num, boolean expValue) {
        boolean result = calculator.isNegative(num);
        Assert.assertEquals(result, expValue, "Result is not correct!");
    }

}
