Feature: Component Initialization and Regular Updates

  Background:
    Given the game engine is running

  Scenario: Initialize a Component within the Game
    Given a Component is not yet initialized
    When the game starts
    Then the Component should be initialized
    And its associated behaviors should be ready for execution

  Scenario: Regularly Update the Component
    Given a Component is initialized
    When the game loop iterates
    Then the Component should be updated regularly
    And its associated behaviors should execute according to the game's logic

  Scenario: Component Affects the Game World
    Given a Component is updated regularly
    When its behaviors execute
    Then the game world should be affected according to the Component's logic

  Scenario: Component Affects Player Interactions
    Given a Component is updated regularly
    When its behaviors execute
    Then player interactions should be affected according to the Component's logic
