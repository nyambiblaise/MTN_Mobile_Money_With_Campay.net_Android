package com.compay.momo.models;

import com.google.gson.annotations.SerializedName;

/**
 * The type Transaction status response.
 */
public class TransactionStatusResponse {
    private String reference;

    private String status;

    private double amount;

    private String currency;

    private String operator;

    private String code;

    @SerializedName("operator_reference")
    private String operatorReference;

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
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Gets currency.
     *
     * @return the currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets currency.
     *
     * @param currency the currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
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

    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Gets operator reference.
     *
     * @return the operator reference
     */
    public String getOperatorReference() {
        return operatorReference;
    }

    /**
     * Sets operator reference.
     *
     * @param operatorReference the operator reference
     */
    public void setOperatorReference(String operatorReference) {
        this.operatorReference = operatorReference;
    }

    @Override
    public String toString() {
        return "TransactionStatusResponse{" +
                "reference='" + reference + '\'' +
                ", status='" + status + '\'' +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                ", operator='" + operator + '\'' +
                ", code='" + code + '\'' +
                ", operatorReference='" + operatorReference + '\'' +
                '}';
    }
}
