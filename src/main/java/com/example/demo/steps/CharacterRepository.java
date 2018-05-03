package com.example.demo.steps;

import org.springframework.data.repository.Repository;

import java.util.List;

public interface CharacterRepository extends Repository<GameCharacterEntity, Long>
{
    GameCharacterEntity saveAndFlush(GameCharacterEntity gameCharacterEntity);

    List<GameCharacterEntity> findAll();

    void deleteAll();
}
