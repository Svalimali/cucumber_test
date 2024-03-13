Feature: Tile Dynamics and Their Influence on Game Strategy

  Background:
    Given the game board is set up with various Tiles

  Scenario: Robot Moved by Belt Tile
    Given a Robot ends its turn on a Belt Tile
    When the next turn begins
    Then the Robot should be moved in the direction indicated by the Belt Tile
    And this movement occurs before the Robot's next action

  Scenario: Robot Blocked by Wall Tile
    Given a Robot attempts to move into a Wall Tile
    When the move action is executed
    Then the Robot should remain in its current location
    And receive feedback that the path is blocked

  Scenario: Robot Eliminated by Hole Tile
    Given a Robot moves onto a Hole Tile
    When the move action is completed
    Then the Robot should be removed from the game board
    And possibly respawn at the last passed Checkpoint or Spawn Tile

  Scenario: Robot Marks Progress at Checkpoint Tile
    Given a Robot passes over a Checkpoint Tile
    When the Robot crosses the Checkpoint
    Then the Robot's progress should be recorded
    And the Checkpoint becomes the Robot's new respawn point if eliminated

  Scenario: Robot Starts from Spawn Tile
    Given the game begins
    When Robots are placed on the game board
    Then each Robot should start from a designated Spawn Tile
    And orient themselves for the start of the game based on Spawn Tile directions

  Scenario: Influence on Strategy by Tile Composition
    Given the game board's Tiles influence robot movement and strategy
    When players navigate the game board
    Then they must adapt their strategies to the Tile compositions
    And plan their moves and actions according to the terrain's challenges and opportunities
