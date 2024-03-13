Feature: Manage Player Turns and Game Phases

  Background:
    Given the game has started
    And multiple players are participating

  Scenario: Initiate Player Turn
    Given it is the start of a new round
    When the Scheduler initiates a turn
    Then it should select the next player in sequence
    And provide them the opportunity to act

  Scenario: Transition Between Player Turns
    Given a player has completed their turn
    When the turn ends
    Then the Scheduler should initiate the turn of the next player in sequence
    And ensure that each player has equal opportunities to act

  Scenario: Manage Game Phases
    Given the game is divided into multiple phases
    When a phase concludes
    Then the Scheduler should transition the game to the next phase
    And inform all players of the current game phase

  Scenario: Ensure Fair Play
    Given each player is to have equal opportunities to act
    When managing turns and game phases
    Then the Scheduler should enforce rules to prevent any player from gaining an unfair advantage

  Scenario: Handle End of Round
    Given all players have completed their turns for the current round
    When the last turn ends
    Then the Scheduler should evaluate if the game meets criteria for another round or end of the game
    And if another round is warranted, prepare and initiate the next round
