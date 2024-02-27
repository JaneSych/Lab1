package org.rntgroup;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalcTest extends BaseTest{

    @Test(description = "Unit Sum Test", dataProvider = "valuesForSumTest")
    public void unitSumTest(long num1, long num2, long expValue){
        System.out.println("Unit Sum test");

        //Act
        long result = calculator.sum(num1,num2);

        //Assert
        Assert.assertEquals(result, expValue, "error");
    }

    @DataProvider(name = "valuesForSumTest")
    public Object[][] valuesForSum() {
        return new Object[][] {
                {10, 15, 25},
                {10, -15, -5},
                {0, 0, 0},
                {-1, 10, 9}
        };
    }
}
