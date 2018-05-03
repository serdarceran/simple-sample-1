package com.example.demo.steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class CommanLineRun implements CommandLineRunner
{
    @Autowired
    private GameMenu gameMenu;

    @Override public void run(String... args) throws Exception
    {
        gameMenu.goCharacterCreate();

        Thread.sleep(100000);
    }
}
