package com.example.demo.steps;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class GameCharacterEntity
{
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private int age;

    private String skinColor;
}
