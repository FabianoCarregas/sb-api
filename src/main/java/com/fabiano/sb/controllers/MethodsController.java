package com.fabiano.sb.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/methods")
public class MethodsController {

    @GetMapping
    public String get(){
        return "Requisition GET";
    }
    @PostMapping
    public String post(){
        return "Requisition POST";
    }
    @PutMapping
    public String put(){
        return "Requisition PUT";
    }
    @DeleteMapping
    public String delete(){
        return "Requisition DELETE";
    }
    @PatchMapping
    public String patch(){
        return "Requisition PATCH";
    }

}
