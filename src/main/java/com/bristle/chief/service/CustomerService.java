package com.bristle.chief.service;

import com.bristle.chief.data_access.dao.CustomerDAO;
import com.bristle.chief.data_access.dao.OrderDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerDAO customerDAO;

    @Autowired
    public CustomerService(CustomerDAO customerDAO){
        this.customerDAO = customerDAO;
    }

}
