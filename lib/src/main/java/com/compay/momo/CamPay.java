package com.compay.momo;

import com.compay.momo.models.ApplicationBalanceResponse;
import com.compay.momo.models.PaymentRequestResponse;
import com.compay.momo.models.Token;
import com.compay.momo.models.TransactionStatusResponse;
import com.compay.momo.models.WithdrawalResponse;
import com.compay.momo.models.requests.CollectionRequest;
import com.compay.momo.models.requests.TokenRequest;
import com.compay.momo.models.requests.WithdrawRequest;
import com.compay.momo.services.RestServices;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * The type Cam pay.
 */
public class CamPay {

    private static CamPay camPayInstance;
    private final String username;
    private final String password;
    private final RestServices restService;
    private static final String HEADER_INI = "Token ";


    private CamPay(String username, String password, Environment environment) {
        this.username = username;
        this.password = password;
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(environment == Environment.PROD ? "https://campay.net/" : "https://demo.campay.net/")
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .build();

        this.restService = retrofit.create(RestServices.class);
    }

    /**
     * Init Cam Pay mobile SDK.
     *
     * @param username    the username
     * @param password    the password
     * @param environment the environment
     * @return the cam pay
     */
    public static CamPay init(String username, String password, Environment environment) {
        if (camPayInstance == null) {
            camPayInstance = new CamPay(username, password, environment);
        }
        return camPayInstance;
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static CamPay getInstance() {
        return camPayInstance;
    }

    /**
     * Collection request.
     *
     * @param request the request
     * @return the observable
     */
    public @NonNull Observable<PaymentRequestResponse> collect(@NonNull CollectionRequest request) {
        return this.getToken()
                .switchMap(token -> restService.collect(
                        request, HEADER_INI + token.getToken()));
    }

    /**
     * Transaction status.
     *
     * @param transactionId the transaction id
     * @return the observable
     */
    public @NonNull Observable<TransactionStatusResponse> transactionStatus(@NonNull String transactionId) {
        return this.getToken()
                .switchMap(token -> restService.transactionStatus(
                        transactionId, HEADER_INI + token.getToken()));
    }

    /**
     * Withdraw.
     *
     * @param withdrawRequest the withdraw request
     * @return the observable
     */
    public @NonNull Observable<WithdrawalResponse> withdraw(@NonNull WithdrawRequest withdrawRequest) {
        return this.getToken()
                .switchMap(token -> restService.withdraw(
                        withdrawRequest, HEADER_INI + token.getToken()));
    }

    /**
     * Application balance.
     *
     * @return the observable
     */
    public @NonNull Observable<ApplicationBalanceResponse> applicationBalance() {
        return this.getToken()
                .switchMap(token -> restService.applicationBalance(
                        HEADER_INI + token.getToken()));
    }

    private Observable<Token> getToken() {
        return restService.retrieveToken(
                TokenRequest.TokenRequestBuilder
                        .aTokenRequest()
                        .withPassword(password)
                        .withUsername(username)
                        .build()
        );
    }

    /**
     * The enum Environment.
     */
    public enum Environment {
        /**
         * Development environment.
         */
        DEV,
        /**
         * Production environment.
         */
        PROD
    }
}
