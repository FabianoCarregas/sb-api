package com.fabiano.sb.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @RequestMapping(path = "/test")
    public String test(){
        return"TESTE";
    }
}
