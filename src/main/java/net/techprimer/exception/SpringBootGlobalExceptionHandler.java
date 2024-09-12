package net.techprimer.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class SpringBootGlobalExceptionHandler {

	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(ItemNotFoundException.class)
	public @ResponseBody CustomExceptionResponse handleItemNotFoundException(ItemNotFoundException ex) {
		return new CustomExceptionResponse(ex.getMessage(), HttpStatus.NOT_FOUND.value());
	}

}
