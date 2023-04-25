package vasconcelos.silvio.pirateproject.exception;


import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@ResponseStatus(HttpStatus.NOT_FOUND)
public class PirateNotFoundException extends RuntimeException {

    private String name;

    public PirateNotFoundException(String name) {
        super("Pirate not found");
        this.name = name;
    }
}
