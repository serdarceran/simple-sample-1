package com.example.demo;

import com.example.demo.steps.CommandLineRead;

import java.util.HashMap;
import java.util.Map;

public class CommandLineReadTester implements CommandLineRead
{
    private final Map<String,Object> map = new HashMap<>();

    public CommandLineReadTester supply(String key, Object value)
    {
        map.put(key, value);
        return this;
    }

    @Override public String readString(String key)
    {
        return (String) map.get(key);
    }

    @Override public Number readNumber(String key)
    {
        return (Number) map.get(key);
    }

    @Override public boolean readBoolean(String key)
    {
        return (boolean) map.get(key);
    }
}
