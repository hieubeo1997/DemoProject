package com.services;

import com.entity.Customer;
import com.model.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface CustomerService {
    List<CustomerDTO> GetAllWithPage(Integer total , Integer page);
    List<CustomerDTO> GetAll();
    Optional<Customer> GetCustomerByID(Integer ID);

    public List<Customer> FindCustomerByName(String name);

    public Customer GetCustomerByPhoneNumber(String phone);

    public void CreateCustomer(Customer customer);

    void remove(int id);

}
