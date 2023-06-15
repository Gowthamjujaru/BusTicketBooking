package com;

public class InvalidChoiseException extends RuntimeException {
	private String message;
	public InvalidChoiseException(String message) {
		this.message = message;
		
	}
	public String getMessage() {
		return message;
	}

}
