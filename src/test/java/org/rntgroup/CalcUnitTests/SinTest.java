package org.rntgroup.CalcUnitTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SinTest extends BaseTest {

    @DataProvider(name = "valuesForSin")
    private Object[][] valuesForSin() {
        return new Object[][]{
                {0, 0},
                {30, 0.49999999999999994},
                {45, 0.7071067811865475},
                {60, 0.8660254037844386},
                {90, 1},
                {180, 0},
                {270, -1},
                {360, 0},
                {-90, -1},
                {-400, -0.6427876096865391},
                {1, 0.01745240643728351},
                {187, -0.12186934340514731}
        };
    }

    @Test(description = "Unit Sin Test",
            dataProvider = "valuesForSin")
    public void unitSinTest(double angle, double expValue) {
        double result = calculator.sin(Math.toRadians(angle));
        Assert.assertEquals(result, expValue, "Result is not correct!");
    }

    @Test(description = "Unit Sin Of Infinity Test")
    public void unitSinOfInfinityTest() {
        Assert.assertThrows(IllegalArgumentException.class, () -> { calculator.sin(Math.toRadians(Double.POSITIVE_INFINITY));});
    }

}
