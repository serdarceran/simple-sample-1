Feature: A character can be created
  It is possible to create a new character.

  Scenario: Create a character
    Given There is no character in the system
    When I create a new character
    Then the character should have been created