package com;

public class InvalidTicketSizeException extends RuntimeException {
	private String message;
	public InvalidTicketSizeException(String message) {
		this.message = message;
	}
	@Override
	public String getMessage() {
		return message ;
	}
}
