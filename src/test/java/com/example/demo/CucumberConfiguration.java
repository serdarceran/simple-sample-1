package com.example.demo;

import com.example.demo.steps.CommandLineRead;
import com.example.demo.steps.CommandLineReadImpl;
import cucumber.api.CucumberOptions;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CucumberConfiguration {

    @Bean
    public CommandLineRead commandLineRead() {
        return new CommandLineReadTester();
    }
}
