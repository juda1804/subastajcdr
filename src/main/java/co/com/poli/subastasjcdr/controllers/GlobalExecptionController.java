package co.com.poli.subastasjcdr.controllers;

import co.com.poli.subastasjcdr.errors.ResourceBadRequest;
import co.com.poli.subastasjcdr.errors.ResourceNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExecptionController {
    @ExceptionHandler(ResourceNotFound.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public @ResponseBody String handleCustomException(ResourceNotFound ex) {
        return ex.getMessage();
    }

    @ExceptionHandler(ResourceBadRequest.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public @ResponseBody String handleCustomException2(ResourceBadRequest ex) {
        return ex.getMessage();
    }
}
