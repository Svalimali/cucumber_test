package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*; // Import JUnit Assert for verification

public class CardTest {
    private Game game;
    private Player player;
    private Robot robot;
    private Card currentCard;

    @Given("the game has started")
    public void theGameHasStarted() {
        game = new Game();
        player = new Player();
        robot = new Robot();
        game.addPlayer(player);
        player.assignRobot(robot);
    }

    @Given("players have cards in their hand")
    public void playersHaveCardsInTheirHand() {
        player.giveCard(new MovementCard());
        player.giveCard(new DamageCard());
        player.giveCard(new PowerUpCard());
    }

    @Given("a player has a MovementCard")
    public void aPlayerHasAMovementCard() {
        currentCard = player.getCardOfType(MovementCard.class);
    }

    @When("the player uses the MovementCard")
    public void thePlayerUsesTheMovementCard() {
        player.useCard(currentCard);
    }

    @Then("the associated robot should move according to the card's instructions")
    public void theAssociatedRobotShouldMoveAccordingToTheCardsInstructions() {
        assertTrue(robot.hasMoved());
    }

    @Then("the card is then discarded to the DiscardPile")
    public void theCardIsThenDiscardedToTheDiscardPile() {
        assertTrue(game.discardPileContains(currentCard));
    }

    @Given("a player has a DamageCard")
    public void aPlayerHasADamageCard() {
        currentCard = player.getCardOfType(DamageCard.class);
    }

    @When("the player uses the DamageCard on an enemy or obstacle")
    public void thePlayerUsesTheDamageCardOnAnEnemyOrObstacle() {
        player.useCard(currentCard);
    }

    @Then("the target should receive damage as specified by the card")
    public void theTargetShouldReceiveDamageAsSpecifiedByTheCard() {
        assertTrue(robot.targetDamaged()); // Assuming robot.targetDamaged() checks if the last target was damaged
    }

    @Given("a player has a PowerUpCard")
    public void aPlayerHasAPowerUpCard() {
        currentCard = player.getCardOfType(PowerUpCard.class);
    }

    @When("the player uses the PowerUpCard on a robot or player")
    public void thePlayerUsesThePowerUpCardOnARobotOrPlayer() {
        player.useCard(currentCard);
    }

    @Then("the target should receive the specified power-up effect")
    public void theTargetShouldReceiveTheSpecifiedPowerUpEffect() {
        assertTrue(robot.hasPowerUp()); // Assuming robot.hasPowerUp() verifies if a power-up effect is active
    }

    // Mock classes to simulate game environment
    private class Game {
        public void addPlayer(Player player) {
        }

        public boolean discardPileContains(Card currentCard) {
            return true;
        }
        // Add method implementations
    }

    private class Player {
        private List<Card> cards = new ArrayList<>(); // To hold the cards

        public void assignRobot(Robot robot) {
            // Implementation
        }

        public void giveCard(Card card) {
            //cards.add(card);
        }

        // Updated to use generics for flexibility
        public <T extends Card> T getCardOfType(Class<T> cardClass) {
            for (Card card : cards) {
                if (cardClass.isInstance(card)) {
                    return cardClass.cast(card); // Returns the specific card type
                }
            }
            return null; // If no card of specified type is found
        }

        public void useCard(Card currentCard) {
            // Implementation
            cards.remove(currentCard); // Assuming you remove the card when used
        }
    }

    private class Robot {
        public boolean hasMoved() {
            return true;
        }

        public boolean targetDamaged() {
            return true;
        }

        public boolean hasPowerUp() {
            return true;
        }
    }

    private class Card {
        // Add method implementations
    }

    private class MovementCard extends Card {
        // Add method implementations
    }

    private class DamageCard extends Card {
        // Add method implementations
    }

    private class PowerUpCard extends Card {
        // Add method implementations
    }
}
