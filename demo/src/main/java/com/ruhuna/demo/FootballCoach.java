package com.ruhuna.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FootballCoach implements ICoach{

    @Override
    public String getDailyWorkout() {
        return "Running for 20 minutes";
    }
}
