package com.compay.momo.models.requests;

import com.compay.momo.models.commons.Withdrawal;

/**
 * The type Withdraw request.
 */
public class WithdrawRequest extends Withdrawal {

    /**
     * The type Withdraw request builder.
     */
    public static final class WithdrawRequestBuilder {
        private String amount;
        private String to;
        private String description;
        private String externalReference;

        private WithdrawRequestBuilder() {
        }

        /**
         * A withdraw request withdraw request builder.
         *
         * @return the withdraw request builder
         */
        public static WithdrawRequestBuilder aWithdrawRequest() {
            return new WithdrawRequestBuilder();
        }

        /**
         * With amount withdraw request builder.
         *
         * @param amount the amount
         * @return the withdraw request builder
         */
        public WithdrawRequestBuilder withAmount(String amount) {
            this.amount = amount;
            return this;
        }

        /**
         * With to withdraw request builder.
         *
         * @param to the to
         * @return the withdraw request builder
         */
        public WithdrawRequestBuilder withTo(String to) {
            this.to = to;
            return this;
        }

        /**
         * With description withdraw request builder.
         *
         * @param description the description
         * @return the withdraw request builder
         */
        public WithdrawRequestBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * With external reference withdraw request builder.
         *
         * @param externalReference the external reference
         * @return the withdraw request builder
         */
        public WithdrawRequestBuilder withExternalReference(String externalReference) {
            this.externalReference = externalReference;
            return this;
        }

        /**
         * Build withdraw request.
         *
         * @return the withdraw request
         */
        public WithdrawRequest build() {
            WithdrawRequest withdrawRequest = new WithdrawRequest();
            withdrawRequest.setAmount(amount);
            withdrawRequest.setTo(to);
            withdrawRequest.setDescription(description);
            withdrawRequest.setExternalReference(externalReference);
            return withdrawRequest;
        }
    }
}
