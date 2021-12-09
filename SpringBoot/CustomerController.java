package com.example.materClass;
//step 2 customer controller or API layer //annotate the class with @RestController and @RequestMapping

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;



//step 25:@ PostMapping-while posting data in the database you must ensure that client fills in the spaces needed if not
            //the data cannot be sent and for as do that we must import a library from
// spring boot called "spring-boot-starter-validation" in pom.xml
//Step 26:handling Exception watch the video "Enable properties to view exception details
@RestController
@RequestMapping(path = "api/v1/customers") //step 2:this is API AND HTTP METHOD

public class CustomerController {
    private final CustomerService customerService;
@Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    //step 5:create a method used to get customer from service layer and annotate it //with@GetMapping
        @GetMapping
        List<Customer> getCustomers () {
            return customerService.getCustomers();
        }
        @GetMapping(path = "{CustomerId}")
        //step 18: @Get Mapping this is an API layer method that is used to get only
// one customer then pass the method to customer Service where the info will be filtered and some logic performed step 10
        Customer getCustomer (@PathVariable("CustomerId") Long id){
            return customerService.getCustomer(id);
        }
        @PostMapping// Step 19 @ PostMapping this method is used to create new student and save it in the database using Json
        void createNewCustomer (@RequestBody Customer customer)
        { //step 25 annotate with @Valid-->dont forget to test
            System.out.println("Post Request.....");
            System.out.println(customer);
        }
        @PutMapping   //step 20  //@ PutMapping is a method used to edit or update data in the database
        void updateNewCustomer (@Valid @RequestBody Customer customer){
            System.out.println("Post Request...... “ ");
        }
        //step 21 @DeleteMapping is a method used to delete customer/data from the database by using Id
        @DeleteMapping(path = "{CustomerId}")
        void deleteCustomer (@PathVariable("CustomerId") Long id){
            System.out.println("Delete customer id " + id);
        }
    }
