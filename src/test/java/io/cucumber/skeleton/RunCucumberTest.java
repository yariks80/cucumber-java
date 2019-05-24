package io.cucumber.skeleton;

import cucumber.api.CucumberOptions;


@CucumberOptions(

        plugin = {
                "json:target/reports.json",
                "html:target/reports",
                "pretty",
        },

        features = {"src/features"},
        monochrome = true,
        glue = {"io.cucumber.skeleton"},
        tags = {"~@ignored"}
)

public class RunCucumberTest {
}
