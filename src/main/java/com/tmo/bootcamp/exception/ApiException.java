package com.tmo.bootcamp.exception;

import org.springframework.http.HttpStatus;

public class ApiException extends RuntimeException {

	private HttpStatus statusCode;
	transient ErrorMessage errorDetail;



	public ApiException(HttpStatus statusCode, String errorMessage) {
		super(errorMessage);
		this.statusCode = statusCode ;
		setErrorDetail(statusCode, errorMessage) ;
	}


	public HttpStatus getStatusCode() {
		return statusCode;
	}

	public ErrorMessage getErrorDetail() {
		return errorDetail;
	}

	private void setErrorDetail(HttpStatus statusCode, String errorMessage) {
		this.statusCode = statusCode;
		this.errorDetail = new ErrorMessage(errorMessage);
	}
}
