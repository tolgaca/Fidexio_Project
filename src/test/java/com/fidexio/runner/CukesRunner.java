package com.fidexio.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

public class CukesRunner {


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
            tags = "",
            publish = true

    )
    public class ClassRunner{ }
}
