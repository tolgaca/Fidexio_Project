package com.fidexio.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json",
                "html:target/cucumber/report.html",
                "junit:target/junit/junit-report.xml",
                "rerun:target/rerun.txt",},
        features = "src/test/resources/features",
        glue = "com/fidexio/step_definitions",
        dryRun = false ,
        tags = "@smoke",
        publish = true

)
public class CukesRunner {
}
