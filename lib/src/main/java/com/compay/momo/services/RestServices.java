package com.compay.momo.services;

import com.compay.momo.models.ApplicationBalanceResponse;
import com.compay.momo.models.PaymentRequestResponse;
import com.compay.momo.models.Token;
import com.compay.momo.models.TransactionStatusResponse;
import com.compay.momo.models.WithdrawalResponse;
import com.compay.momo.models.requests.CollectionRequest;
import com.compay.momo.models.requests.TokenRequest;
import com.compay.momo.models.requests.WithdrawRequest;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * The interface Rest services.
 */
public interface RestServices {

    /**
     * Retrieve token.
     *
     * @param tokenRequest the token request
     * @return the observable
     */
    @POST("api/token/")
    Observable<Token> retrieveToken(@Body TokenRequest tokenRequest);

    /**
     * Collection endpoint.
     *
     * @param collectionRequest the collection request
     * @param authorization     the authorization
     * @return the observable
     */
    @POST("api/collect/")
    Observable<PaymentRequestResponse> collect(@Body CollectionRequest collectionRequest, @Header("Authorization") String authorization);

    /**
     * Transaction status.
     *
     * @param transactionId the transaction id
     * @param authorization the authorization
     * @return the observable
     */
    @GET("api/transaction/{id}/")
    Observable<TransactionStatusResponse> transactionStatus(@Path("id") String transactionId, @Header("Authorization") String authorization);

    /**
     * Withdraw.
     *
     * @param withdrawRequest the withdraw request
     * @param authorization   the authorization
     * @return the observable
     */
    @POST("api/withdraw/")
    Observable<WithdrawalResponse> withdraw(@Body WithdrawRequest withdrawRequest, @Header("Authorization") String authorization);

    /**
     * Application balance.
     *
     * @param authorization the authorization
     * @return the observable
     */
    @GET("api/balance/")
    Observable<ApplicationBalanceResponse> applicationBalance(@Header("Authorization") String authorization);

}
