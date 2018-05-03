package com.example.demo.steps;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GameMenu {

  @Autowired private CommandLineRead commandLineRead;
  @Autowired private CharacterRepository characterRepository;

  public void goCharacterCreate() {
    System.out.println("Lets create a character...");
    System.out.println("Character Name:");
    String name = commandLineRead.readString("name");
    Number age = commandLineRead.readNumber("age");
    String skinColor = commandLineRead.readString("skinColor");
    GameCharacterEntity gameCharacterEntity =
        GameCharacterEntity.builder().name(name).age(age.intValue()).skinColor(skinColor).build();
    characterRepository.saveAndFlush(gameCharacterEntity);
  }
}
