package com.fabiano.sb.controllers;

import com.fabiano.sb.models.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/clients")
public class ClientController {

    @GetMapping(path = "/any")
    public Client getClient(){
        return new Client(20, "Fabiano", "123.123.123-09");
    }
    @GetMapping(path = "/{id}")
    public Client getClientById(@PathVariable int id){
        return new Client(id, "Maria", "333.222.111-00");
    }


    }















































