package com.ruhuna.demo;

import org.springframework.stereotype.Component;

@Component
public class BasketBallCoach implements ICoach{
    @Override
    public String getDailyWorkout() {
        return "Practice 3 points for 15 minutes";
    }
}
