Feature: Deck Management for DrawPile and DiscardPile

  Background:
    Given the game has started
    And there is a Deck comprised of a DrawPile and a DiscardPile

  Scenario: Draw a Card from the DrawPile
    Given the DrawPile has cards available
    When a player draws a card
    Then the top card from the DrawPile should be provided to the player
    And the DrawPile's total number of cards should decrease by one

  Scenario: Discard a Card to the DiscardPile
    Given a player has used a card
    When the card is discarded
    Then the card should be added to the top of the DiscardPile
    And the DiscardPile's total number of cards should increase by one

  Scenario: Shuffle the DiscardPile into the DrawPile
    Given the DrawPile is empty
    And the DiscardPile has cards
    When the DiscardPile needs to be shuffled into the DrawPile
    Then all cards from the DiscardPile should be moved to the DrawPile
    And the cards should be shuffled to ensure randomness

  Scenario: Ensure Strategic Options Through Card Cycle
    Given the cycle of drawing and discarding cards
    When players interact with the Deck
    Then they should be provided with a variety of strategic options
    And the cycle ensures a dynamic gameplay experience

  Scenario: Prevent Drawing from an Empty DrawPile
    Given the DrawPile is empty
    And the DiscardPile has cards
    When a player attempts to draw a card
    Then the DiscardPile should be shuffled into the DrawPile first
    And then the player draws a card from the newly populated DrawPile

  Scenario: Handling a Completely Depleted Deck
    Given both the DrawPile and DiscardPile are empty
    When a player attempts to draw a card
    Then the game should provide a mechanism to handle this scenario
    And ensure the gameplay can continue or conclude according to game rules
