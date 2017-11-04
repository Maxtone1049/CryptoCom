package com.example.android.cryptocom;

import android.content.Intent;
import android.icu.text.DecimalFormat;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.android.cryptocom.R;

/**
 * Created by USER on 10/31/2017.
 */

public class BTCConversion extends AppCompatActivity {

    private TextView tvTitle, tvSubtitle, tvOutputName, tvOutputRate;
    private EditText etInput;
    private String currencyName;
    private Double currencyRate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btcconversion);

        tvTitle = (TextView) findViewById(R.id.tvTitle);
        tvSubtitle = (TextView) findViewById(R.id.tv_SubTitle);
        tvOutputName = (TextView) findViewById(R.id.tvOutputName);
        tvOutputRate = (TextView) findViewById(R.id.tvOutputRate);
        etInput = (EditText) findViewById(R.id.etInput);

        Intent myIntent = getIntent();
        currencyName = myIntent.getStringExtra("currency_name");
        currencyRate = myIntent.getDoubleExtra("currency_rate", 0);

        tvSubtitle.setText("1 BTC = " + currencyRate + " " + currencyName.toUpperCase());
        tvOutputName.setText(currencyName.toUpperCase() + " Rate: ");


        etInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (etInput.getText().toString().length() == 0 || etInput.getText().toString().isEmpty()) {
                    tvOutputRate.setText("0");
                } else

                    calculate();
            }

            @Override
            public void afterTextChanged(Editable s) {


            }
        });

    }

    private void calculate() {

        if (etInput.getText().toString().length() == 0) {
            return;
        }

        double input;
        input = Double.parseDouble(etInput.getText().toString());

        double output;
        output = input * currencyRate;

        DecimalFormat decimalFormat = new DecimalFormat("#,###,###");
        tvOutputRate.setText(decimalFormat.format(output));
    }



}

