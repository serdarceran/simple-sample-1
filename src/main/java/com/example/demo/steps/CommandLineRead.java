package com.example.demo.steps;

public interface CommandLineRead
{
    String readString(String key);

    Number readNumber(String key);

    boolean readBoolean(String key);
}
