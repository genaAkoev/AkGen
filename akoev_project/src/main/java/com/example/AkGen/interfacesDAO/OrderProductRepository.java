package com.example.AkGen.interfacesDAO;

import com.example.AkGen.entity.OrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "orders-products", path = "orders-products")

public interface OrderProductRepository extends JpaRepository<OrderProduct, Long> {
}
