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
                "./src/test/resources/testng.xml",
                "./src/test/resources/ArithmeticFunctionUnitTests.xml"
        ));

        List<XmlSuite> suites = new ArrayList<>();
        suites.add(suite);

        testNG.setXmlSuites(suites);
        testNG.run();
    }
}
