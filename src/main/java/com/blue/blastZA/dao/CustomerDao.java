package com.blue.blastZA.dao;

import com.blue.blastZA.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerDao {
    public List<Customer> getAll();

    public Customer get(int id);

    public Object save(Customer customer);

    public void saveList(List<Customer> customer);

    public void delete(int id);
}
