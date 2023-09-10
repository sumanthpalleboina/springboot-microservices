package net.javaguides.employeeservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class EmailAlreadyExistedException extends RuntimeException {
    public EmailAlreadyExistedException() {
        super("Email Already Existed!");
    }
}
