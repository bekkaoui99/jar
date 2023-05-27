package com.example.jarfile.repo;

import com.example.jarfile.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepo extends JpaRepository<Client , Long> {
}
