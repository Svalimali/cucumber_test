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
        features = "src/test/resources/example", // path to your feature files
        glue = "stepdefinitions", // your step definitions package
        plugin = {"pretty", "html:target/cucumber-reports.html"}, // plugins for reporting
        monochrome = true
)

public class RunCucumberTest {
    private String today;
    private String actualAnswer;

    @Given("today is Sunday")
    public void today_is_Sunday() {
        today = "Sunday";
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_its_Friday_yet() {
        actualAnswer = isItFriday(today);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }

    private String isItFriday(String today) {
        return "Friday".equals(today) ? "Yes" : "Nope";
    }

    @Given("the game board is set up with various Tiles")
    public void theGameBoardIsSetUpWithVariousTiles() {
        
    }

    @Given("a Robot ends its turn on a Belt Tile")
    public void aRobotEndsItsTurnOnABeltTile() {
        
    }

    @When("the next turn begins")
    public void theNextTurnBegins() {
    }
}
