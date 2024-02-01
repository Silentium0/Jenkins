package com.loop.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/html-reports/cucumber-report.html",
                "json:target/json-report/json-report.json"},
        features = "src/test/resources/features",
        glue = "com/loop/step_definition",
        dryRun = false,
        tags = "@B2G3-252"

)
public class CucksRunner {

}
