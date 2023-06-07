package com.compay.momo.models;

/**
 * The type Token.
 */
public class Token {
    private String token;

    private int expiresIn;

    /**
     * Gets token.
     *
     * @return the token
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets token.
     *
     * @param token the token
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * Gets expires in.
     *
     * @return the expires in
     */
    public int getExpiresIn() {
        return expiresIn;
    }

    /**
     * Sets expires in.
     *
     * @param expiresIn the expires in
     */
    public void setExpiresIn(int expiresIn) {
        this.expiresIn = expiresIn;
    }

    @Override
    public String toString() {
        return "Token [ " +
                "token : '" + token + '\'' +
                ", expiresIn : " + expiresIn +
                ']';
    }
}
