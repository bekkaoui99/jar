package com.example.jarfile;

import com.example.jarfile.entities.Client;
import com.example.jarfile.repo.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JarfileApplication implements CommandLineRunner {


    @Autowired
    private ClientRepo service;

    public static void main(String[] args) {
        SpringApplication.run(JarfileApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        for (int i = 0; i < 10; i++) {
            Client client = new Client();
            client.setFirstname("hamza");
            client.setLastname("bekkaoui");
            client.setAdresse("amal 10");
            client.setMail("hamzabekkaoui@gmail.com");
        }

    }
}
