package com.demoqa.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/com/demoqa/features"}
        ,plugin = {"pretty", "json:target/report.json",
        "de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber"}
        ,glue = {"com/demoqa/hooks","com/demoqa/stepDefinitions"}
        ,tags = "not @ignore"
        ,publish = true



        )
public class TestRunner {
}
