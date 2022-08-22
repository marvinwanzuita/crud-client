package com.bootcamp.crudclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.crudclient.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
