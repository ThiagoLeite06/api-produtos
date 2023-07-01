package com.thiagoleite.justAnotherApp.repositories;

import com.thiagoleite.justAnotherApp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
