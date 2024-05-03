package com.linda.springcore.common;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class VolleyBallCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "Practise Volley all day";
    }
}
