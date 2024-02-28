package org.rntgroup.CalcUnitTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsPositiveSignTest extends BaseTest {

    @DataProvider(name = "valuesForIsPositiveSign")
    private Object[][] valuesForIsPositiveSign() {
        return new Object[][]{
                {0, false},
                {1000, true},
                {-3, false},
        };
    }

    @Test(description = "Unit IsPositiveSign Test",
            dataProvider = "valuesForIsPositiveSign")
    public void unitIsPositiveSignTest(long num, boolean expValue) {
        boolean result = calculator.isPositive(num);
        Assert.assertEquals(result, expValue, "Result is not correct!");
    }

}
