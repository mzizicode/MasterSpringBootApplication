package com.example.materClass;
import com.example.materClass.CustomerRepo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


import java.util.List;
//step 11 :create an interface and call it customer Repo

public interface CustomerRepo {
 List<Customer> getCustomers();//step 11 :this is the method used to get a list of customer from the database

}

