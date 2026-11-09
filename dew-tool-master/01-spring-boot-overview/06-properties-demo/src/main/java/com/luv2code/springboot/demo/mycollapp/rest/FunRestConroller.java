package com.luv2code.springboot.demo.mycollapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class FunRestConroller {

    // inject properties from application.properties
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // endpoint: /teaminfo
    @GetMapping("/teaminfo")
    public String getCoachInfo() {
        return "Coach: " + coachName + ", Team name: " + teamName;
    }

    // endpoint: /
    @GetMapping("/")
    public String sayHello() {
        return "Hello world!";
    }

    // endpoint: /workout
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

    // endpoint: /Ani
    @GetMapping("/Ani")
    public String youDeserveAllTheBest() {
        return "You Are Perfect";
    }
}