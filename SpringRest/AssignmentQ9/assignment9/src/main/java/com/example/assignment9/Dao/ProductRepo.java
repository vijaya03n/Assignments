package com.example.assignment9.Dao;

import com.example.assignment9.Models.Product;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends MongoRepository<Product, Integer> {
    public Product findById(int id);

    public Product findByName(String name);
}
