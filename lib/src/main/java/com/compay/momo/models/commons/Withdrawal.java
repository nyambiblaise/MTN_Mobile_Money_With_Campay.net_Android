package com.compay.momo.models.commons;

import com.google.gson.annotations.SerializedName;

/**
 * The type Withdrawal.
 */
public class Withdrawal {
    private String amount;
    private String to;
    private String description;
    @SerializedName("external_reference")
    private String externalReference;

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * Gets to.
     *
     * @return the to
     */
    public String getTo() {
        return to;
    }

    /**
     * Sets to.
     *
     * @param to the to
     */
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets external reference.
     *
     * @return the external reference
     */
    public String getExternalReference() {
        return externalReference;
    }

    /**
     * Sets external reference.
     *
     * @param externalReference the external reference
     */
    public void setExternalReference(String externalReference) {
        this.externalReference = externalReference;
    }
}
