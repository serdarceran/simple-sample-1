package com.example.demo.steps;

import com.example.demo.AbstractTest;
import com.example.demo.steps.CharacterRepository;
import cucumber.api.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

public class CommonSteps extends AbstractTest
{
  @Autowired
  private CharacterRepository characterRepository;

  @Given("^There is no character in the system$")
  public void I_am_on_the_user_creation_page() {
    characterRepository.deleteAll();
  }

}
