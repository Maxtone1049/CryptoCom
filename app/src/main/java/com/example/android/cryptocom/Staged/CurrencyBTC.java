package com.example.android.cryptocom.Staged;

/**
 * Created by USER on 10/31/2017.
 */

public class CurrencyBTC {
    private String name;
    private double rate;

    public CurrencyBTC(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

}

