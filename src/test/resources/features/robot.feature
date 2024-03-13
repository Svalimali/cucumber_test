Feature: Robot Navigation, Combat, and Resource Management

  Background:
    Given a Robot is initialized in the game world

  Scenario: Robot Moves Within the Game World
    Given the Robot is in a specific location
    When the player commands the Robot to move to a new location
    Then the Robot should navigate to the specified location
    And avoid obstacles automatically if possible

  Scenario: Robot Attacks an Enemy or Obstacle
    Given the Robot encounters an enemy or obstacle
    When the player commands the Robot to attack
    Then the Robot should execute the attack maneuver
    And deal damage to the enemy or obstacle

  Scenario: Manage Robot Health
    Given the Robot has a health attribute
    When the Robot takes damage
    Then its health should decrease according to the damage received
    And if health reaches zero, the Robot should be incapacitated

  Scenario: Robot Uses Currency for Upgrades or Repairs
    Given the Robot has accumulated currency
    When the Robot is at a shop or repair station
    Then the player can use the currency to purchase upgrades or repairs
    And the Robot's capabilities or health should improve accordingly

  Scenario: Robot Recovers Health
    Given the Robot has been damaged
    When the Robot uses a health recovery item or service
    Then its health should increase by the item's or service's specified amount

  Scenario: Robot Upgrades Combat Abilities
    Given the Robot wants to improve its combat effectiveness
    When the player uses currency to purchase combat upgrades
    Then the Robot's attack damage, speed, or other combat attributes should increase
