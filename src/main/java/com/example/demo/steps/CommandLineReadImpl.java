package com.example.demo.steps;

import java.util.Scanner;

public class CommandLineReadImpl implements CommandLineRead
{
    private static final Scanner scanner = new Scanner(System.in);

    @Override public String readString(String key)
    {
        return scanner.next();
    }

    @Override public Number readNumber(String key)
    {
        return scanner.nextInt();
    }

    @Override public boolean readBoolean(String key)
    {
        return scanner.nextBoolean();
    }
}
