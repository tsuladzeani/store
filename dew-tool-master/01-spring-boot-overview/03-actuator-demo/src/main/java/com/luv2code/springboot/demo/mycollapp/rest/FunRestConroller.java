package com.luv2code.springboot.demo.mycollapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FunRestConroller {
    @GetMapping( "/")
    public String sayHelll(){
        return "Hello world!";
    }

    @GetMapping("/workout")
    public String getDayliWorkout(){
        return "Run a hard 5k!";
    }

    @GetMapping ("/Ani")
    public String youDeserveAllTheBest(){
        return "You Are Perfect";
    }
}
