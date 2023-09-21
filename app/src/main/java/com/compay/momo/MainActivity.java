package com.compay.momo;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.compay.momo.CamPay;
import com.compay.momo.models.requests.CollectionRequest;
import com.compay.momo.models.requests.WithdrawRequest;


import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    private CamPay camPay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tel = findViewById(R.id.phone);
        TextView amt = findViewById(R.id.amount);
        TextView res = findViewById(R.id.reason);
        TextView msg = findViewById(R.id.message);//
        TextView transacStatus = findViewById(R.id.status);
        String telephone = "2376xxxxxxxx";
        String money = "100";
        String paymentReason = "Momo Fee";
        CamPay.init(
                "13vbwFMC-Sbx7YiuXtNgKpcamPIs0nDomNnclrfLwDawejHCFK3sUCQLQf91t942D3xDGWtA93kWudx5YCF7iQ",
                "WmLfYwi375CRvV09MKrTySyG-seyoLnrWlyf4bdqRy1mqv1TFxQ1uuay_rcDYueyEv0V7dnmx42D_WwvXm7ZQw",
                CamPay.Environment.DEV
        );

        camPay = CamPay.getInstance();

        camPay.collect(
                CollectionRequest.CollectionRequestBuilder
                        .aCollectionRequest()
                        .withAmount(money)
                        .withFrom(telephone)
                        .withDescription(paymentReason)
                        .withExternalReference(UUID.randomUUID().toString())
                        .withCurrency("XAF")
                        .build()
        ).delay(2, TimeUnit.MINUTES)
                .switchMap(collectResponse -> {
                    tel.setText("Tel: "+telephone);
                    amt.setText("Amt: "+money);
                    res.setText("Reason: "+paymentReason);
                    msg.setText("Response Message: "+collectResponse);
                            System.out.println("Collection Response is => : "+collectResponse);
                            return camPay.transactionStatus(collectResponse.getReference());
                        }
                ).subscribe(
                transactionStatusResponse -> {
                    transacStatus.setText("Transaction Status: "+transactionStatusResponse);
                    System.out.println("System Transaction Response===> "+transactionStatusResponse);
                }
        );

        camPay.applicationBalance().subscribe(applicationBalanceResponse ->
                System.out.println(applicationBalanceResponse)
        );

        camPay.transactionStatus("transactionID")
                .subscribe(
                        transactionStatusResponse -> System.out.println(transactionStatusResponse)
                );

        camPay.withdraw(WithdrawRequest.WithdrawRequestBuilder
                .aWithdrawRequest()
                .withTo("237XXXXXXXXX")
                .withExternalReference(UUID.randomUUID().toString())
                .withDescription("some reason")
                .withAmount("100")
                .build())
                .subscribe(withdrawalResponse ->
                        System.out.println(withdrawalResponse));
    }
}
