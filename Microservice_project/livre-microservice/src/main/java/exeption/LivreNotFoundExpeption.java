package exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class LivreNotFoundExpeption extends RuntimeException {

    public LivreNotFoundExpeption(String message) {
        super(message);
    }


}
