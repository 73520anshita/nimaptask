package com.nimaptask.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.nimaptask.model.Product;



public interface ProductRepository extends  JpaRepository<Product, Long> {

	
}