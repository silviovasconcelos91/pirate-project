package vasconcelos.silvio.pirateproject.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.net.URI;

@RestControllerAdvice
public class PirateRestAdvise {


    @ExceptionHandler(value = {PirateNotFoundException.class})
    public ProblemDetail handlePirateNotFoundException(PirateNotFoundException pirateNotFoundException) {
        String message = String.format("The pirate %s doesn't exist", pirateNotFoundException.getName());
        ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, pirateNotFoundException.getMessage());
        problemDetail.setProperty("pirateName", pirateNotFoundException.getName());
        problemDetail.setTitle(message);
        problemDetail.setType(URI.create("http://blabla/resolve/pirate-not-found"));
        return problemDetail;
    }
}
