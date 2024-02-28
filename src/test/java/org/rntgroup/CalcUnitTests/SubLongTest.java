package org.rntgroup.CalcUnitTests;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubLongTest extends BaseTest {

    @DataProvider(name = "valuesForSubLongTest")
    private Object[][] valuesForSub() {
        return new Object[][] {
                {0, 0, 0},
                {10, 15, -5},
                {10, -15, 25},
                {-1, 10, -11},
                {-1, -10, 9}
        };
    }

    @Test(description = "Unit Sub Long Test",
            dataProvider = "valuesForSubLongTest",
            groups = "SubTest")
    public void unitSubLongTest(long num1, long num2, long expValue){
        long result = calculator.sub(num1,num2);
        Assert.assertEquals(result, expValue, "Result is not correct!");
    }
}
