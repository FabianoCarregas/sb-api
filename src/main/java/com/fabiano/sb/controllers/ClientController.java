package com.fabiano.sb.controllers;

import com.fabiano.sb.models.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @GetMapping(path = "/clients")
    public Client getClient(){
        return new Client(20, "Fabiano", "123.123.123-09");

    }
}
