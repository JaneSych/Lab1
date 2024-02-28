package org.rntgroup;

import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestRunner {
    public static void main(String[] args) {
        TestNG testNG = new TestNG();

        XmlSuite suite = new XmlSuite();
        suite.setSuiteFiles(Arrays.asList(
                "./src/test/resources/ArithmeticFunctionUnitTests.xml",
                "./src/test/resources/PowerFunctionUnitTests.xml",
                "./src/test/resources/TrigonometricFunctionUnitTests.xml",
                "./src/test/resources/SingDefinitionFunctionUnitTests.xml"
        ));

        List<XmlSuite> suites = new ArrayList<>();
        suites.add(suite);

        testNG.setXmlSuites(suites);
        testNG.run();
    }
}
