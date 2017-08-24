package com.stripe.exception.oauth;

public class InvalidClientException extends OAuthException {

	private static final long serialVersionUID = 1L;

	public InvalidClientException(String code, String description, String requestId, Integer statusCode, Throwable e) {
		super(code, description, requestId, statusCode, e);
	}

}
