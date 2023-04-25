package vasconcelos.silvio.pirateproject.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class PirateRestAdvise {

    @ExceptionHandler(value = {PirateNotFoundException.class})
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public PirateNotFoundMessage handlePirateNotFoundException(PirateNotFoundException pirateNotFoundException) {
        String message = String.format("The pirate %s doesn't exist", pirateNotFoundException.getName());
        return new PirateNotFoundMessage(HttpStatus.NOT_FOUND, pirateNotFoundException.getMessage(), message);
    }
}
