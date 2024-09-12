package net.techprimer.exception;

public class CustomExceptionResponse {

	private Integer statusCode;
	private String message;

	public CustomExceptionResponse(String message, int statusCode) {
		super();
		this.message = message;
		this.statusCode = statusCode;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
