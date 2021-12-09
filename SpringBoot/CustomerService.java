package com.example.materClass;
import com.example.materClass.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import java.util.List;
//step 6 :create a layer called Customerservice and annotate it with @Service THIS is
// also the layer used to perform business logic @Service public class Customerservice
@Service
public class CustomerService {
    //step 7: connect a class called CustomerRepo with customer Service
    private final CustomerRepo customerRepo;
    //step 8: create a constructor from customer repo
@Autowired
    public CustomerService( CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }
    //step 9: This method is used to get a list of customers from customer Repo
    List<Customer>getCustomers(){
        return customerRepo.getCustomers();
    }
    //step 10: this method is used to get a single customer from customer repo using ID
    Customer getCustomer(Long id){
    return customerRepo.getCustomers()
            .stream()
            .filter(customer -> customer.getId().equals(id))
            .findFirst()
            //step 28 exception is thrown here change this with "new Not FoundException"
            .orElseThrow(()->new NotFoundException("customer with " + id + "not Found"));
    }

}
