package org.rntgroup;

import com.epam.tat.module4.Calculator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTest {

    @Test(description = "Unit Sum Test")
    public void unitSumTest(){
        //Arrange
        Calculator calculator = new Calculator();

        //Act
        long result = calculator.sum(15,20);

        //Assert
        Assert.assertEquals(result, 35, "error");
    }
}
