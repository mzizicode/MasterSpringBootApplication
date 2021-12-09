package com.example.materClass;
//STEP:TWO ON API EXCEPTION
// STEP 29:create a new class and extend it
public class ApiRequestException extends RuntimeException {
    //step 29:0override the two methods by using "Ctrl+O".
    public ApiRequestException(String message) {
        super(message);
    }

    public ApiRequestException(String message, Throwable cause) {
        super(message, cause);
    }
}

//step 29: inside the exception package create a requestException class and name it "ApiRequestException"
// extend RuntimeException
// Override the two contractors (ApiRequestException(String message), ApiRequestException (String message,
// Throwable cause)).
// by pressing "CTRL+O".