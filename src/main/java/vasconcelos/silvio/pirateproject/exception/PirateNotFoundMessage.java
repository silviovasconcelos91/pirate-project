package vasconcelos.silvio.pirateproject.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public class PirateNotFoundMessage {

    private HttpStatus httpStatus;
    private String message;
    private String description;
}
