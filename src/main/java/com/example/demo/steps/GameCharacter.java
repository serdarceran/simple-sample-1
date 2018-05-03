package com.example.demo.steps;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.modelmapper.ModelMapper;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GameCharacter
{
    private static final ModelMapper MAPPER = new ModelMapper();

    private String name;
    private int age;

    public GameCharacterEntity toEntity()
    {
        return MAPPER.map(this, GameCharacterEntity.class);
    }
}
