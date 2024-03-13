package NotYetImplemented;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // path to your feature files
        glue = "stepdefinitions", // your step definitions package
        plugin = {"pretty", "html:target/cucumber-reports.html"}, // plugins for reporting
        monochrome = true
)
public class MouseControlTest {

    @Given("the game is running")
    public void theGameIsRunning() {
    }

    @Given("the Player is using MouseControls")
    public void thePlayerIsUsingMouseControls() {
    }

    @Given("the Player hovers the mouse over a game object")
    public void thePlayerHoversTheMouseOverAGameObject() {
    }

    @When("the Player clicks the mouse button")
    public void thePlayerClicksTheMouseButton() {
    }

    @Then("the game object should be picked up")
    public void theGameObjectShouldBePickedUp() {
    }

    @Then("attached to the mouse cursor until released")
    public void attachedToTheMouseCursorUntilReleased() {
    }

    @Given("the Player has picked up a game object")
    public void thePlayerHasPickedUpAGameObject() {
    }

    @When("the Player moves the mouse to a valid placement location")
    public void thePlayerMovesTheMouseToAValidPlacementLocation() {
    }

    @When("the Player releases the mouse button")
    public void thePlayerReleasesTheMouseButton() {
    }

    @Then("the game object should be placed at the location")
    public void theGameObjectShouldBePlacedAtTheLocation() {
    }

    @Then("should interact with the game's interface or world accordingly")
    public void shouldInteractWithTheGamesInterfaceOrWorldAccordingly() {
    }

    @When("the Player moves the mouse to an invalid placement location")
    public void thePlayerMovesTheMouseToAnInvalidPlacementLocation() {
    }

    @Then("the game object should not be placed")
    public void theGameObjectShouldNotBePlaced() {
    }

    @Then("a feedback message or indication should show the action is invalid")
    public void aFeedbackMessageOrIndicationShouldShowTheActionIsInvalid() {
    }

    @Given("game objects that can be interacted with")
    public void gameObjectsThatCanBeInteractedWith() {
    }

    @Then("the game object should be highlighted")
    public void theGameObjectShouldBeHighlighted() {
    }

    @Then("indicate it can be interacted with")
    public void indicateItCanBeInteractedWith() {
    }
}
