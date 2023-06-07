package com.compay.momo.models;

import com.google.gson.annotations.SerializedName;

/**
 * The type Payment request response.
 */
public class PaymentRequestResponse {
    private String reference;

    @SerializedName("ussd_code")
    private String ussdCode;

    private String operator;

    /**
     * Gets reference.
     *
     * @return the reference
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets reference.
     *
     * @param reference the reference
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * Gets ussd code.
     *
     * @return the ussd code
     */
    public String getUssdCode() {
        return ussdCode;
    }

    /**
     * Sets ussd code.
     *
     * @param ussdCode the ussd code
     */
    public void setUssdCode(String ussdCode) {
        this.ussdCode = ussdCode;
    }

    /**
     * Gets operator.
     *
     * @return the operator
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Sets operator.
     *
     * @param operator the operator
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "PaymentRequestResponse{" +
                "reference='" + reference + '\'' +
                ", ussdCode='" + ussdCode + '\'' +
                ", operator='" + operator + '\'' +
                '}';
    }
}
