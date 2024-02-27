package org.rntgroup;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected Calculator calculator;

    @BeforeMethod
    public void SetUp() {
        System.out.println("Set Up Base Test");
        calculator = new Calculator();
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Tear Down Base Test");
        calculator = null;
    }
}
