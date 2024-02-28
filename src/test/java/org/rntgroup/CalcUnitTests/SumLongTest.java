package org.rntgroup.CalcUnitTests;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumLongTest extends BaseTest {

    @DataProvider(name = "valuesForSumLongTest")
    private Object[][] valuesForSum() {
        return new Object[][] {
                {0, 0, 0},
                {10, 15, 25},
                {10, -15, -5},
                {-1, 10, 9},
                {-1, -10, -11}
        };
    }

    @Test(description = "Unit Sum Long Test",
            dataProvider = "valuesForSumLongTest",
            groups = "SumTest")
    public void unitSumLongTest(long num1, long num2, long expValue){
        long result = calculator.sum(num1,num2);
        Assert.assertEquals(result, expValue, "Result is not correct!");
    }
}
