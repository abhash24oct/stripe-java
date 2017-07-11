package com.stripe.exception.oauth;

public class UnsupportedGrantTypeException extends OAuthException {

	private static final long serialVersionUID = 1L;

	public UnsupportedGrantTypeException(String code, String description, String requestId, Integer statusCode, Throwable e) {
		super(code, description, requestId, statusCode, e);
	}

}
