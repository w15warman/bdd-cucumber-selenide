package com.si;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"src/test/resources"},
//    glue = "src.test.java.com.si.definitions",
    plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
    tags = {"@debug"}
)
public class TestRunner {

}