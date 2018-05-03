package com.example.demo.steps;

import com.example.demo.AbstractTest;
import com.example.demo.CommandLineReadTester;
import com.example.demo.steps.CharacterRepository;
import com.example.demo.steps.GameCharacterEntity;
import com.example.demo.steps.GameMenu;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

public class ExploreSteps extends AbstractTest
{

  @Autowired private CharacterRepository characterRepository;

  @Autowired private CommandLineReadTester commandLineRead;

  @Autowired private GameMenu gameMenu;

  @Given("^There is a character in the system")
  public void There_Is_A_Character_In_The_System() {
    GameCharacterEntity character =
        GameCharacterEntity.builder().age(12).name("zerga").skinColor("red").build();
    characterRepository.saveAndFlush(character);
  }

  @When("^I want to explore in the game")
  public void I_Want_To_Explore_In_The_Game() {}

  @Then("^the character can explore to several places")
  public void the_character_can_explore_to_several_places() {}

  @Then("^it reached the target")
  public void it_reached_the_target() {}

  @Then("^the game ends")
  public void the_game_ends() {
//    Assert.fail();
  }
}
