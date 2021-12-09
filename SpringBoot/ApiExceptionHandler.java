package com.example.materClass;


import com.example.materClass.ApiRequestException;
import com.example.materClass.ApiRequestException;
import com.example.materClass.NotFoundException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind. annotation. ControllerAdvice;
import org.springframework.web.bind. annotation. ExceptionHandler;

import java.time. ZonedDateTime;
                   //STEP: FOUR ON API EXCEPTION
// step 31 create a new class and call it ApiExceptionHandler and annotate it with @ControllerAdvice
@ControllerAdvice
public class ApiExceptionHandler {
//step 31:annotate with @ExceptionHandler----->step 32 go back to customer controller and test the exception
@ExceptionHandler(value = ApiRequestException.class)
public ResponseEntity<Object> handleApiException(
ApiRequestException e) {
    ApiException apiException = new ApiException(
            e.getMessage(),
            e,
            HttpStatus.BAD_REQUEST,
            ZonedDateTime.now()
    );
    return new ResponseEntity<>(
            apiException,
            HttpStatus.BAD_REQUEST
    );
}
 @ExceptionHandler(value = NotFoundException.class)
  public ResponseEntity<Object> handleApiException(
          NotFoundException e)
 {
     ApiException apiException=new ApiException(
             e.getMessage(),
             e,
             HttpStatus.NOT_FOUND,
             ZonedDateTime.now()
     );
     return new ResponseEntity<>(
             apiException,
             HttpStatus.NOT_FOUND
     );
 }
                   }



