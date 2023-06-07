package com.compay.momo.models.requests;

/**
 * The type Token request.
 */
public class TokenRequest {
    private String username;
    private String password;

    /**
     * Gets username.
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets username.
     *
     * @param username the username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
    }


    /**
     * The type Token request builder.
     */
    public static final class TokenRequestBuilder {
        private String username;
        private String password;

        private TokenRequestBuilder() {
        }

        /**
         * A token request token request builder.
         *
         * @return the token request builder
         */
        public static TokenRequestBuilder aTokenRequest() {
            return new TokenRequestBuilder();
        }

        /**
         * With username token request builder.
         *
         * @param username the username
         * @return the token request builder
         */
        public TokenRequestBuilder withUsername(String username) {
            this.username = username;
            return this;
        }

        /**
         * With password token request builder.
         *
         * @param password the password
         * @return the token request builder
         */
        public TokenRequestBuilder withPassword(String password) {
            this.password = password;
            return this;
        }

        /**
         * Build token request.
         *
         * @return the token request
         */
        public TokenRequest build() {
            TokenRequest tokenRequest = new TokenRequest();
            tokenRequest.setUsername(username);
            tokenRequest.setPassword(password);
            return tokenRequest;
        }
    }
}
