package com.ipap.springreactpacking.repository;

import com.ipap.springreactpacking.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
