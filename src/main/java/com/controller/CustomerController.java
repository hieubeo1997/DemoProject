package com.controller;

import com.model.CustomerDTO;
import com.repository.CustomerRepo;
import com.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerRepo customerRepo;
    @Autowired
    private CustomerService customerService;
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @RequestMapping(value = "/Admin/Customer", method = RequestMethod.GET)
    public ResponseEntity<?> getAllCustomers(@RequestParam int page) {
        List<CustomerDTO> dskh = customerService.GetAllWithPage(5,page);
        if (dskh.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return ResponseEntity.status(HttpStatus.OK).body(dskh);
    }
    @RequestMapping(value = "/Admin/Customer/All", method = RequestMethod.GET)
    public ResponseEntity<?> getAll() {
        List<CustomerDTO> dskh = customerService.GetAll();
        if (dskh.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return ResponseEntity.status(HttpStatus.OK).body(dskh);
    }
}
