package one.digitalinnovation.personapi.excepition;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PersonNotFoundExeption extends Exception {
    public PersonNotFoundExeption(Long id) {
        super("Person not found with ID + id ");
    }
}
