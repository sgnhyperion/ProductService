package com.harshproductservice.productservice.ExceptionHandlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.harshproductservice.productservice.DTO.ExceptionDTO;
import com.harshproductservice.productservice.Exceptions.ProductNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandlers {

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<ExceptionDTO> handleArithmeticException(Exception e){
        ExceptionDTO exceptionDTO = new ExceptionDTO();

        exceptionDTO.setMessage("Something went wrong");
        exceptionDTO.setResolution("Arithmetic Exception");
        ResponseEntity<ExceptionDTO> responseEntity = new ResponseEntity<>(exceptionDTO,HttpStatus.BAD_REQUEST);

        return responseEntity;
        
    }
    
    @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
    public ResponseEntity<ExceptionDTO> handleArrayIndexOutOfBoundsException(Exception e){
        ExceptionDTO exceptionDTO = new ExceptionDTO();

        exceptionDTO.setMessage("Something went wrong");
        exceptionDTO.setResolution("ArrayIndexOutOfBounds Exception");
        ResponseEntity<ExceptionDTO> responseEntity = new ResponseEntity<>(exceptionDTO,HttpStatus.BAD_REQUEST);

        return responseEntity;
        
    }

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ExceptionDTO> handleProductNotFoundException(ProductNotFoundException productNotFoundException){
        ExceptionDTO exceptionDTO = new ExceptionDTO();

        exceptionDTO.setMessage("Product Id" + productNotFoundException.getId() + " not found");
        exceptionDTO.setResolution("ProductNotFound Exception");
        ResponseEntity<ExceptionDTO> responseEntity = new ResponseEntity<>(exceptionDTO,HttpStatus.BAD_REQUEST);

        return responseEntity;
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionDTO> handleAllExceptions(Exception e){
        ExceptionDTO exceptionDTO = new ExceptionDTO();

        exceptionDTO.setMessage("Something went wrong");
        exceptionDTO.setResolution("Exception");
        ResponseEntity<ExceptionDTO> responseEntity = new ResponseEntity<>(exceptionDTO,HttpStatus.BAD_REQUEST);

        return responseEntity;
    }
}
