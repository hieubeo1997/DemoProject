package com.services;

import com.entity.Customer;
import com.mapper.CustomerMapper;
import com.model.CustomerDTO;
import com.repository.CustomerRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public List<CustomerDTO> GetAllWithPage(Integer total, Integer page) {
        int at=(page-1)*total;
        List<Customer> khachhang = customerRepo.GetCustomersWithPages(at, total);
        List<CustomerDTO> rs = new ArrayList<>();
        for(Customer c : khachhang){
            rs.add(CustomerMapper.toCustomerDTO(c));
        }
        return rs;
    }

    @Override
    public List<CustomerDTO> GetAll() {
        List<Customer> khachhang = customerRepo.findAll();
        List<CustomerDTO> rs = new ArrayList<>();
        for(Customer c : khachhang){
            rs.add(CustomerMapper.toCustomerDTO(c));
        }
        return rs;
    }

    @Override
    public Optional<Customer> GetCustomerByID(Integer ID) {
        return Optional.empty();
    }

    @Override
    public List<Customer> FindCustomerByName(String name) {
        return null;
    }

    @Override
    public Customer GetCustomerByPhoneNumber(String phone) {
        return null;
    }

    @Override
    public void CreateCustomer(Customer customer) {

    }

    @Override
    public void remove(int id) {

    }
}
