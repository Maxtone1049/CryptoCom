package com.example.android.cryptocom.TRANS;

import com.example.android.cryptocom.Staged.CurrencyBTC;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by USER on 10/31/2017.
 */

public class BTC_TRANS {
    /**
     * NGN : 1949684.55
     * USD : 5397.54
     * EUR : 4639.91
     * JPY : 614319.82
     * GBP : 4133.87
     * AUD : 7177.03
     * CAD : 7033.78
     * CHF : 5567.08
     * SEK : 50000
     * NZD : 8353.26
     * MXN : 105008.21
     * SGD : 7553.11
     * HKD : 41798.67
     * NOK : 45608.22
     * KRW : 6245707.42
     * TRY : 20916.05
     * RUB : 307272
     * INR : 368150.62
     * BRL : 18180
     * ZAR : 81340.04
     */

    @SerializedName("NGN")
    private double NGN;
    @SerializedName("USD")
    private double USD;
    @SerializedName("EUR")
    private double EUR;
    @SerializedName("JPY")
    private double JPY;
    @SerializedName("GBP")
    private double GBP;
    @SerializedName("AUD")
    private double AUD;
    @SerializedName("CAD")
    private double CAD;
    @SerializedName("CHF")
    private double CHF;
    @SerializedName("SEK")
    private double SEK;
    @SerializedName("NZD")
    private double NZD;
    @SerializedName("MXN")
    private double MXN;
    @SerializedName("SGD")
    private double SGD;
    @SerializedName("HKD")
    private double HKD;
    @SerializedName("NOK")
    private double NOK;
    @SerializedName("KRW")
    private double KRW;
    @SerializedName("TRY")
    private double TRY;
    @SerializedName("RUB")
    private double RUB;
    @SerializedName("INR")
    private double INR;
    @SerializedName("BRL")
    private double BRL;
    @SerializedName("ZAR")
    private double ZAR;

    public List<CurrencyBTC> getCurrencyBTCList() {
        List<CurrencyBTC> currencyBTCList = new ArrayList<>();
        currencyBTCList.add(new CurrencyBTC("NGN", getNGN()));
        currencyBTCList.add(new CurrencyBTC("USD", getUSD()));
        currencyBTCList.add(new CurrencyBTC("EUR", getEUR()));
        currencyBTCList.add(new CurrencyBTC("JPY", getJPY()));
        currencyBTCList.add(new CurrencyBTC("GBP", getGBP()));
        currencyBTCList.add(new CurrencyBTC("AUD", getAUD()));
        currencyBTCList.add(new CurrencyBTC("CAD", getCAD()));
        currencyBTCList.add(new CurrencyBTC("CHF", getCHF()));
        currencyBTCList.add(new CurrencyBTC("SEK", getSEK()));
        currencyBTCList.add(new CurrencyBTC("NZD", getNZD()));
        currencyBTCList.add(new CurrencyBTC("MXN", getMXN()));
        currencyBTCList.add(new CurrencyBTC("SGD", getSGD()));
        currencyBTCList.add(new CurrencyBTC("HKD", getHKD()));
        currencyBTCList.add(new CurrencyBTC("NOK", getNOK()));
        currencyBTCList.add(new CurrencyBTC("KRW", getKRW()));
        currencyBTCList.add(new CurrencyBTC("TRY", getTRY()));
        currencyBTCList.add(new CurrencyBTC("RUB", getRUB()));
        currencyBTCList.add(new CurrencyBTC("INR", getINR()));
        currencyBTCList.add(new CurrencyBTC("BRL", getBRL()));
        currencyBTCList.add(new CurrencyBTC("ZAR", getZAR()));
        return currencyBTCList;
    }


    public double getNGN() {
        return NGN;
    }

    public void setNGN(double NGN) {
        this.NGN = NGN;
    }

    public double getUSD() {
        return USD;
    }

    public void setUSD(double USD) {
        this.USD = USD;
    }

    public double getEUR() {
        return EUR;
    }

    public void setEUR(double EUR) {
        this.EUR = EUR;
    }

    public double getJPY() {
        return JPY;
    }

    public void setJPY(double JPY) {
        this.JPY = JPY;
    }

    public double getGBP() {
        return GBP;
    }

    public void setGBP(double GBP) {
        this.GBP = GBP;
    }

    public double getAUD() {
        return AUD;
    }

    public void setAUD(double AUD) {
        this.AUD = AUD;
    }

    public double getCAD() {
        return CAD;
    }

    public void setCAD(double CAD) {
        this.CAD = CAD;
    }

    public double getCHF() {
        return CHF;
    }

    public void setCHF(double CHF) {
        this.CHF = CHF;
    }

    public double getSEK() {
        return SEK;
    }

    public void setSEK(double SEK) {
        this.SEK = SEK;
    }

    public double getNZD() {
        return NZD;
    }

    public void setNZD(double NZD) {
        this.NZD = NZD;
    }

    public double getMXN() {
        return MXN;
    }

    public void setMXN(double MXN) {
        this.MXN = MXN;
    }

    public double getSGD() {
        return SGD;
    }

    public void setSGD(double SGD) {
        this.SGD = SGD;
    }

    public double getHKD() {
        return HKD;
    }

    public void setHKD(double HKD) {
        this.HKD = HKD;
    }

    public double getNOK() {
        return NOK;
    }

    public void setNOK(double NOK) {
        this.NOK = NOK;
    }

    public double getKRW() {
        return KRW;
    }

    public void setKRW(double KRW) {
        this.KRW = KRW;
    }

    public double getTRY() {
        return TRY;
    }

    public void setTRY(double TRY) {
        this.TRY = TRY;
    }

    public double getRUB() {
        return RUB;
    }

    public void setRUB(double RUB) {
        this.RUB = RUB;
    }

    public double getINR() {
        return INR;
    }

    public void setINR(double INR) {
        this.INR = INR;
    }

    public double getBRL() {
        return BRL;
    }

    public void setBRL(double BRL) {
        this.BRL = BRL;
    }

    public double getZAR() {
        return ZAR;
    }

    public void setZAR(double ZAR) {
        this.ZAR = ZAR;
    }
}

