package com.example.materClass;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
          //STEP:ONE ON API EXCEPTION
@ResponseStatus(value = HttpStatus.NOT_FOUND)//STEP 28:annotate this class with @ResponseStatus
//---->ctrl + space to navigate around http status
public class NotFoundException extends RuntimeException{
    public NotFoundException(String message) {
        super(message);
    }
}
//step 7 :when handling exceptions you need to create a package for that
//after creating a new package create a class called " NotFoundException and then extend RuntimeException"
//Note:We have two types of exception:RuntimeException and checkException
//step 28 annotate the NotFoundException class with @ResponseStatus(value=HttpStatus.Not_Found)
// and then on the service class change new illegal exception to new NotFoundException then create a constructor in the
//NotFoundException class this will change the status from  500 to 404 which is the client error
