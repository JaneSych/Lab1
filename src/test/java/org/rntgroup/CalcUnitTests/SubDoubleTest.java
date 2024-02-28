package org.rntgroup.CalcUnitTests;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubDoubleTest extends BaseTest {

    @DataProvider(name = "valuesForSubDoubleTest")
    private Object[][] valuesForSub() {
        return new Object[][] {
                {0.0, 0.0, 0.0},
                {0, 0.0, 0.0},
                {10.10, 15.33, -5.23},
                {10.1, 15, -4.9},
                {-10.10, -15.50, 5.4},
                {-13.10, 10.1, -23.2}
        };
    }

    @Test(description = "Unit Sub Double Test",
            dataProvider = "valuesForSubDoubleTest",
            groups = "SubTest")
    public void unitSubDoubleTest(double num1, double num2, double expValue){
        double result = calculator.sub(num1,num2);
        Assert.assertEquals(result, expValue, "Result is not correct!");
    }
}
