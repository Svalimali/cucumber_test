Feature: Player Interaction with Game Objects using MouseControls

  Background:
    Given the game is running
    And the Player is using MouseControls

  Scenario: Pick Up a Game Object with Mouse Controls
    Given the Player hovers the mouse over a game object
    When the Player clicks the mouse button
    Then the game object should be picked up
    And attached to the mouse cursor until released

  Scenario: Place a Picked-Up Game Object
    Given the Player has picked up a game object
    When the Player moves the mouse to a valid placement location
    And the Player releases the mouse button
    Then the game object should be placed at the location
    And should interact with the game's interface or world accordingly

  Scenario: Attempt to Place Game Object at Invalid Location
    Given the Player has picked up a game object
    When the Player moves the mouse to an invalid placement location
    And the Player releases the mouse button
    Then the game object should not be placed
    And a feedback message or indication should show the action is invalid

  Scenario: Highlight Game Object on Mouse Hover
    Given game objects that can be interacted with
    When the Player hovers the mouse over a game object
    Then the game object should be highlighted
    And indicate it can be interacted with