package com.makara.currencyexchange;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void navigateToExchangeRielsToUsd(View view) {
        Intent intent = new Intent(this, ExchangeRielsToUsdActivity.class);
        startActivity(intent);
    }

    public void navigateToExchangeUsdToRiels(View view) {
        Intent intent = new Intent(this, ExchangeUsdToRielsActivity.class);
        startActivity(intent);
    }

    public void navigateToExchangeRielsToEuro(View view) {
        Intent intent = new Intent(this, ExchangeRielsToEuroActivity.class);
        startActivity(intent);
    }

    public void navigateToExchangeEuroToRiels(View view) {
        Intent intent = new Intent(this, ExchangeEuroToRielsActivity.class);
        startActivity(intent);
    }
}