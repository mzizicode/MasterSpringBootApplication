package com.example.materClass;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Objects;

public  class Customer {
    private final Long id;
    @NotBlank(message = "fName must not be empty")   //step 25 annotate fName with @Notblank.
    // This makes sure that the fname is not black.
    // To activate step 25 go back to customer controller @Post Mapping and w annotate with @valid

    private final String name;
    //STEP 24:after performing step 22 u must indicate if the property is a read only or a write_only @NotBlank (message = "password must be not empty") //step 25 annotate password with @Notblank.
    // This makes sure that the password is not black.
   // To activate step 25 go back to customer controller @PostMapping and w annotate with @valid
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private final String password;
    //STEP 26 same at step 25 : annotate this property with @EMAIL to make sure the client
    // provide the correct format of email---->to note:make sure u explore other constraints
    @Email(message = "email must be not empty")
    private final String email;

    public Customer(Long id, String name, String password,String email) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email=email;

    }


    // Json Library
    @JsonProperty("CustomerId")
    //step 23: @Json Property is used when you want to change name example:ID to CustomerId

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    //Json library
    @JsonIgnore   //STEP 22:@JsonIgnore is used to block information/getters that u dont wanna send to the client.
    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    //simple steps on how to connect layers in springboot
   //step 1:create a class called customer
  //step 2: create a class called customer controller

}




