package com.compay.momo.models.requests;

import com.google.gson.annotations.SerializedName;

/**
 * The type Collection request.
 */
public class CollectionRequest {
    private String amount;

    private String from;

    private String description;

    private String currency;

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
     * Gets from.
     *
     * @return the from
     */
    public String getFrom() {
        return from;
    }

    /**
     * Sets from.
     *
     * @param from the from
     */
    public void setFrom(String from) {
        this.from = from;
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

    /**
     * The type Collection request builder.
     * Used to easily build a collection request
     */
    public static final class CollectionRequestBuilder {
        private String amount;
        private String from;
        private String description;
        private String currency;
        private String externalReference;

        private CollectionRequestBuilder() {
        }

        /**
         * A collection request collection request builder.
         *
         * @return the collection request builder
         */
        public static CollectionRequestBuilder aCollectionRequest() {
            return new CollectionRequestBuilder();
        }

        /**
         * With amount collection request builder.
         *
         * @param amount the amount
         * @return the collection request builder
         */
        public CollectionRequestBuilder withAmount(String amount) {
            this.amount = amount;
            return this;
        }

        /**
         * With from collection request builder.
         *
         * @param from the from
         * @return the collection request builder
         */
        public CollectionRequestBuilder withFrom(String from) {
            this.from = from;
            return this;
        }

        /**
         * With description collection request builder.
         *
         * @param description the description
         * @return the collection request builder
         */
        public CollectionRequestBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * With currency collection request builder.
         *
         * @param currency the currency
         * @return the collection request builder
         */
        public CollectionRequestBuilder withCurrency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * With external reference collection request builder.
         *
         * @param externalReference the external reference
         * @return the collection request builder
         */
        public CollectionRequestBuilder withExternalReference(String externalReference) {
            this.externalReference = externalReference;
            return this;
        }

        /**
         * Build collection request.
         *
         * @return the collection request
         */
        public CollectionRequest build() {
            CollectionRequest collectionRequest = new CollectionRequest();
            collectionRequest.setAmount(amount);
            collectionRequest.setFrom(from);
            collectionRequest.setDescription(description);
            collectionRequest.setCurrency(currency);
            collectionRequest.setExternalReference(externalReference);
            return collectionRequest;
        }
    }
}
