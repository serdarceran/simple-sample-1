package com.example.demo.steps;

import com.example.demo.AbstractTest;
import com.example.demo.CommandLineReadTester;
import com.example.demo.steps.CharacterRepository;
import com.example.demo.steps.GameCharacterEntity;
import com.example.demo.steps.GameMenu;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

public class CharacterCreationSteps extends AbstractTest
{

  @Autowired private CharacterRepository characterRepository;

  @Autowired private CommandLineReadTester commandLineRead;

  @Autowired private GameMenu gameMenu;

  @When("^I create a new character")
  public void I_create_a_new_user() {
    commandLineRead
            .supply("name", "serdar")
            .supply("age", 34)
            .supply("skinColor", "blue");
    gameMenu.goCharacterCreate();
  }

  @Then("^the character should have been created$")
  public void the_character_should_have_been_created() {
    List<GameCharacterEntity> all = characterRepository.findAll();
    assertThat(all, hasSize(1));
    assertThat(all.get(0).getName(), equalTo("serdar"));
    assertThat(all.get(0).getAge(), equalTo(34));
    assertThat(all.get(0), hasProperty("skinColor", equalTo("blue")));
  }
}
