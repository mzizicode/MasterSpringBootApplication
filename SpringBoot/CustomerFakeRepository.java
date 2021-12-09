package com.example.materClass;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
//step 12 : create a class and call it customerFakeRepository then implement
// step 11:which is the customer Repo
public class CustomerFakeRepository implements CustomerRepo{

    @Override//step 13: once u implement customer repo the method will override
    public List<Customer> getCustomers() {//create an array of customers
        return Arrays.asList(new Customer (2L, "Mike", "123", "email@gmail.com"),
                             new Customer (1L,"Peter", "12345", "eail@gmail.com")
        );
    }
}
//Note:this will connect to a fake database