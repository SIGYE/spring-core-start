package com.example.springcore;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "Practice bawling in 15 minutes";
    }
}
