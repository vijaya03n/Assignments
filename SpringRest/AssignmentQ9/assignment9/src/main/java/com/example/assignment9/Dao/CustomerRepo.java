package com.example.assignment9.Dao;

import com.example.assignment9.Models.Customer;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends MongoRepository<Customer, Integer> {
    public Customer findById(int id);

    public Customer findByFirstName(String name);
}
