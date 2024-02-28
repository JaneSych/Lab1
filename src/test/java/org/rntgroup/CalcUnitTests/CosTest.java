package org.rntgroup.CalcUnitTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CosTest extends BaseTest {

    @DataProvider(name = "valuesForCos")
    private Object[][] valuesForCos() {
        return new Object[][]{
                {0, 1},
                {30, 0.8660254037844387},
                {45, 0.7071067811865476},
                {60, 0.5000000000000001},
                {90, 0},
                {180, -1},
                {270, 0},
                {360, 1},
                {-90, 0},
                {-400, 0.7660444431189781},
                {1, 0.9998476951563913},
                {187, -0.9925461516413221}
        };
    }

    @Test(description = "Unit Cos Test",
            dataProvider = "valuesForCos")
    public void unitCosTest(double angle, double expValue) {
        double result = calculator.cos(Math.toRadians(angle));
        Assert.assertEquals(result, expValue, "Result is not correct!");
    }

    @Test(description = "Unit Cos Of Infinity Test")
    public void unitCosOfInfinityTest() {
        Assert.assertThrows(IllegalArgumentException.class, () -> { calculator.cos(Math.toRadians(Double.POSITIVE_INFINITY));});
    }

}
