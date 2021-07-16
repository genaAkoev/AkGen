package com.example.AkGen.interfacesDAO;

import com.example.AkGen.entity.ClientOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "orders", path = "orders")

public interface OrderRepository extends JpaRepository<ClientOrder, Long> {
}
