package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // path to your feature files
        glue = "stepdefinitions", // your step definitions package
        plugin = {"pretty", "html:target/cucumber-reports.html"}, // plugins for reporting
        monochrome = true
)

public class RunCucumberTest {


}
