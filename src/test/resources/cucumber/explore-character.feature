Feature: A character can explore
  It is possible to explore a character.

  Scenario: Let a character to explore
    Given There is a character in the system
    When I want to explore in the game
    Then the character can explore to several places AND
    Then it reached the target AND
    Then the game ends