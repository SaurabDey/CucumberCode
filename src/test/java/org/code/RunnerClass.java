package org.code;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "featureFolder",
        glue = "org.code",
        plugin  = {"pretty:STDOUT","html:target/HTMLCucumberReport","json:target/Cucumber.json"},
        monochrome = true,
        tags = {"~@Smoke"}
)
public class RunnerClass {


}
