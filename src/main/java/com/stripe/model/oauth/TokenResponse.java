package com.stripe.model.oauth;

import com.stripe.model.StripeObject;

public class TokenResponse extends StripeObject {
	Boolean livemode;
	String scope;
	String stripeUserId;

	@Deprecated
	String accessToken;
	@Deprecated
	String refreshToken;
	@Deprecated
	String stripePublishableKey;
	@Deprecated
	String tokenType;

	public Boolean getLivemode() {
		return livemode;
	}

	public void setLivemode(Boolean livemode) {
		this.livemode = livemode;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getStripeUserId() {
		return stripeUserId;
	}

	public void setStripeUserId(String stripeUserId) {
		this.stripeUserId = stripeUserId;
	}

	/**
	 * @deprecated Use `stripe_user_id` with the `Stripe-Account` header (https://stripe.com/docs/connect/authentication#stripe-account-header)
	 */
	public String getAccessToken() {
		return accessToken;
	}

	/**
	 * @deprecated Use `stripe_user_id` with the `Stripe-Account` header (https://stripe.com/docs/connect/authentication#stripe-account-header)
	 */
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	/**
	 * @deprecated Use `stripe_user_id` with the `Stripe-Account` header (https://stripe.com/docs/connect/authentication#stripe-account-header)
	 */
	public String getRefreshToken() {
		return refreshToken;
	}

	/**
	 * @deprecated Use `stripe_user_id` with the `Stripe-Account` header (https://stripe.com/docs/connect/authentication#stripe-account-header)
	 */
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	/**
	 * @deprecated Use `stripe_user_id` with the `Stripe-Account` header (https://stripe.com/docs/connect/authentication#stripe-account-header)
	 */
	public String getStripePublishableKey() {
		return stripePublishableKey;
	}

	/**
	 * @deprecated Use `stripe_user_id` with the `Stripe-Account` header (https://stripe.com/docs/connect/authentication#stripe-account-header)
	 */
	public void setStripePublishableKey(String scope) {
		this.stripePublishableKey = stripePublishableKey;
	}

	/**
	 * @deprecated Use `stripe_user_id` with the `Stripe-Account` header (https://stripe.com/docs/connect/authentication#stripe-account-header)
	 */
	public String getTokenType() {
		return tokenType;
	}

	/**
	 * @deprecated Use `stripe_user_id` with the `Stripe-Account` header (https://stripe.com/docs/connect/authentication#stripe-account-header)
	 */
	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}
}
