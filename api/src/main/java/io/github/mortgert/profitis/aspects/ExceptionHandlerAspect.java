package io.github.mortgert.profitis.aspects;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerAspect {

    /**
     * @ResponseStatus(HttpStatus.NOT_FOUND)
     *     @ExceptionHandler(ResourceNotFoundException.class)
     *     public String handleResourceNotFoundException(ResourceNotFoundException e) {
     *         return e.getMessage();
     *     }
     */
}
