package com.luv2code.springboot.demo.mycollapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FunRestConroller {
    @GetMapping( "/")
    public String sayHelll(){
        return "Hello world!";
    }

}
