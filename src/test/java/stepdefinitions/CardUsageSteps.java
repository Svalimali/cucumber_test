package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class CardUsageSteps {

    @Given("the game has started")
    public void theGameHasStarted() {
    }

    @Given("players have cards in their hand")
    public void playersHaveCardsInTheirHand() {
    }

    @Given("a player has a MovementCard")
    public void aPlayerHasAMovementCard() {
    }

    @When("the player uses the MovementCard")
    public void thePlayerUsesTheMovementCard() {
    }

    @Then("the associated robot should move according to the card's instructions")
    public void theAssociatedRobotShouldMoveAccordingToTheCardsInstructions() {
    }

    @Then("the card is then discarded to the DiscardPile")
    public void theCardIsThenDiscardedToTheDiscardPile() {
    }

    @Given("a player has a DamageCard")
    public void aPlayerHasADamageCard() {
    }

    @When("the player uses the DamageCard on an enemy or obstacle")
    public void thePlayerUsesTheDamageCardOnAnEnemyOrObstacle() {
    }

    @Then("the target should receive damage as specified by the card")
    public void theTargetShouldReceiveDamageAsSpecifiedByTheCard() {
    }

    @Given("a player has a PowerUpCard")
    public void aPlayerHasAPowerUpCard() {
    }

    @When("the player uses the PowerUpCard on a robot or player")
    public void thePlayerUsesThePowerUpCardOnARobotOrPlayer() {
    }

    @Then("the target should receive the specified power-up effect")
    public void theTargetShouldReceiveTheSpecifiedPowerUpEffect() {
    }
}
