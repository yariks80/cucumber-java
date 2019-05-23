package io.cucumber.skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "json:target/reports.json",
                "html:target/reports",
                "pretty",
        },

        features = {"src\\test\\resources\\io\\cucumber\\skeleton"},
        monochrome = true,
        glue = {"io.cucumber.skeleton"},
        tags = {"~@ignored"}
)

public class RunCucumberTest {
}
