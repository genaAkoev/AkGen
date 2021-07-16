package com.example.AkGen.interfacesDAO;

import com.example.AkGen.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "clients", path = "clients")

public interface ClientRepository extends JpaRepository<Client, Long>{
}
