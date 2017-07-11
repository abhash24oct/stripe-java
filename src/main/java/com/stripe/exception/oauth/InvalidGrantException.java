package com.stripe.exception.oauth;

public class InvalidGrantException extends OAuthException {

	private static final long serialVersionUID = 1L;

	public InvalidGrantException(String code, String description, String requestId, Integer statusCode, Throwable e) {
		super(code, description, requestId, statusCode, e);
	}

}
