package com.example.AkGen.interfacesDAO;

import com.example.AkGen.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "products", path = "products")

public interface ProductRepository extends JpaRepository<Product, Long> {
}
