package com.makara.currencyexchange;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ExchangeUsdToRielsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exchange_usd_to_riels);
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

    public void calculateUsdToRiels(View view) {
        EditText editTextAmount = findViewById(R.id.amount);
        TextView txtResult = findViewById(R.id.result);
        double rate = 4005.11;
        double result = rate * Double.parseDouble(editTextAmount.getText().toString());
        DecimalFormat decim = new DecimalFormat("#,###.##");
        txtResult.setText(decim.format(result) + " KHR");
    }
}