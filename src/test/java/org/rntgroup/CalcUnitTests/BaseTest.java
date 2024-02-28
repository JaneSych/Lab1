package org.rntgroup.CalcUnitTests;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected Calculator calculator;

    @BeforeMethod(groups = {"SumTest", "SubTest", "MultiplyTest", "DivTest"})
    public void SetUp() {
        calculator = new Calculator();
    }

    @AfterMethod(groups = {"SumTest", "SubTest", "MultiplyTest", "DivTest"})
    public void tearDown() {
        calculator = null;
    }
}
