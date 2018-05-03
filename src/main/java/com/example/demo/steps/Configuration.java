package com.example.demo.steps;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@org.springframework.context.annotation.Configuration
public class Configuration {

  @Bean
  public CommandLineRead commandLineRead() {
    return new CommandLineReadImpl();
  }

  @Bean
  @Profile("PROD")
  public CommanLineRun commanLineRun() {
    return new CommanLineRun();
  }
}
