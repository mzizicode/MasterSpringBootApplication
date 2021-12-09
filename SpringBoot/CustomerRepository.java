package com.example.materClass;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;
//STEP 13:create a class called customerRepository and implement customerRepo
public class CustomerRepository implements CustomerRepo {
    @Override//step14:when you implement customer repo the method will override creating a method
    public List<Customer> getCustomers() {
        return Collections.singletonList(new
                Customer (0L,"GRACE", "32342", "grace@gmail.com"));
    }
}
//Note:this will connect to real database
