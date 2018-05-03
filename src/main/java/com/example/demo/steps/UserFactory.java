package com.example.demo.steps;

import org.springframework.stereotype.Service;

@Service
public class UserFactory
{
    public boolean exists()
    {
        return false;
    }

    public String create()
    {
        return "gg";
    }

    public boolean findByUsername(String hede)
    {
        return true;
    }
}
