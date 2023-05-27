package com.example.jarfile.web;


import com.example.jarfile.entities.Client;
import com.example.jarfile.repo.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClientControler {


    @Autowired
    private ClientRepo service;


    @GetMapping(path = "/client")
    public List<Client> clientList(){
        return service.findAll();
    }

}
