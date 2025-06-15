package com.ruhuna.demo;

import org.springframework.stereotype.Component;

// when we annotated with @component  java bean
// @component also make the bean available for dependency injection
@Component
public class CricketCoach implements ICoach{
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 10 minutes";
    }
}
