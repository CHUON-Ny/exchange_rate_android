package com.makara.currencyexchange;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ExchangeRielsToEuroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exchange_riels_to_euro);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                super.onBackPressed();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void calculateRielsToEuro(View view) {
        EditText editTextAmount = findViewById(R.id.amount);
        TextView txtResult = findViewById(R.id.result);
        double rate = 0.000212110;
        double result = rate * Double.parseDouble(editTextAmount.getText().toString());
        DecimalFormat decim = new DecimalFormat("#,###.##");
        txtResult.setText(decim.format(result) + " EUR");
    }
}