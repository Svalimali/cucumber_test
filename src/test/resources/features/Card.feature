Feature: Card Usage for Strategic Gameplay

  Background:
    Given the game has started
    And players have cards in their hand

  Scenario: Use a MovementCard to Move a Robot
    Given a player has a MovementCard
    When the player uses the MovementCard
    Then the associated robot should move according to the card's instructions
    And the card is then discarded to the DiscardPile

  Scenario: Deal Damage with a DamageCard
    Given a player has a DamageCard
    When the player uses the DamageCard on an enemy or obstacle
    Then the target should receive damage as specified by the card
    And the card is then discarded to the DiscardPile

  Scenario: Apply a Power-Up with a PowerUpCard
    Given a player has a PowerUpCard
    When the player uses the PowerUpCard on a robot or player
    Then the target should receive the specified power-up effect
    And the card is then discarded to the DiscardPile