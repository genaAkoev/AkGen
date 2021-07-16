package com.example.AkGen.interfacesDAO;

import com.example.AkGen.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "categories", path = "categories")

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByName(String name);

}
