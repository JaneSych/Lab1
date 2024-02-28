package org.rntgroup.CalcUnitTests;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumDoubleTest extends BaseTest {

    @DataProvider(name = "valuesForSumDoubleTest")
    private Object[][] valuesForSum() {
        return new Object[][] {
                {0.0, 0.0, 0.0},
                {0, 0.0, 0.0},
                {10.1, 15.3, 25.4},
                {10.10, 15.3, 25.4},
                {10.1, 15, 25.1},
                {10, 15.1, 25.1},
                {10.10, -15.50, -5.4},
                {-13.0, -10.1, -23.1}
        };
    }

    @Test(description = "Unit Sum Double Test",
            dataProvider = "valuesForSumDoubleTest",
            groups = "SumTest")
    public void unitSumDoubleTest(double num1, double num2, double expValue){
        double result = calculator.sum(num1,num2);
        Assert.assertEquals(result, expValue, "Result is not correct!");
    }
}
