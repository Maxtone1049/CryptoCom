package com.example.android.cryptocom.TRANS;

import com.example.android.cryptocom.Staged.CurrencyETH;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by USER on 10/31/2017.
 */

public class ETH_TRANS {
    /**
     * NGN : 104537.96
     * USD : 291.76
     * EUR : 251.08
     * JPY : 21852.32
     * GBP : 224.53
     * AUD : 390.46
     * CAD : 386.64
     * CHF : 292.2
     * SEK : 2698.00
     * NZD : 450.74
     * MXN : 5721.00
     * SGD : 404.81
     * HKD : 2382.9
     * NOK : 2461.02
     * KRW : 338319.78
     * TRY : 1128.63
     * RUB : 16619.68
     * INR : 19938.16
     * BRL : 979.37
     * ZAR : 4389.12
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

    public List<CurrencyETH> getCurrencyETHList() {
        List<CurrencyETH> currencyETHList = new ArrayList<>();
        currencyETHList.add(new CurrencyETH("NGN", getNGN()));
        currencyETHList.add(new CurrencyETH("USD", getUSD()));
        currencyETHList.add(new CurrencyETH("EUR", getEUR()));
        currencyETHList.add(new CurrencyETH("JPY", getJPY()));
        currencyETHList.add(new CurrencyETH("GBP", getGBP()));
        currencyETHList.add(new CurrencyETH("AUD", getAUD()));
        currencyETHList.add(new CurrencyETH("CAD", getCAD()));
        currencyETHList.add(new CurrencyETH("CHF", getCHF()));
        currencyETHList.add(new CurrencyETH("SEK", getSEK()));
        currencyETHList.add(new CurrencyETH("NZD", getNZD()));
        currencyETHList.add(new CurrencyETH("MXN", getMXN()));
        currencyETHList.add(new CurrencyETH("SGD", getSGD()));
        currencyETHList.add(new CurrencyETH("HKD", getHKD()));
        currencyETHList.add(new CurrencyETH("NOK", getNOK()));
        currencyETHList.add(new CurrencyETH("KRW", getKRW()));
        currencyETHList.add(new CurrencyETH("TRY", getTRY()));
        currencyETHList.add(new CurrencyETH("RUB", getRUB()));
        currencyETHList.add(new CurrencyETH("INR", getINR()));
        currencyETHList.add(new CurrencyETH("BRL", getBRL()));
        currencyETHList.add(new CurrencyETH("ZAR", getZAR()));
        return currencyETHList;
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

    public void setSEK(int SEK) {
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

    public void setMXN(int MXN) {
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
