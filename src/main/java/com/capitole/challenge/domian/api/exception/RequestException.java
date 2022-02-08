package com.capitole.challenge.domian.api.exception;

public class RequestException extends RuntimeException{
	
	private static final long serialVersionUID = 111111L;
	
	public RequestException(String message) {
		super(message);
	}

}

