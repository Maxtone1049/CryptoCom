package com.example.android.cryptocom.interfacces;

import com.example.android.cryptocom.TRANS.BTC_TRANS;
import com.example.android.cryptocom.TRANS.ETH_TRANS;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by USER on 10/31/2017.
 */

public interface CoinExchangeDuty {

    @GET("data/price?")
    Call<BTC_TRANS> loadBTCExchange(@Query("fsym") String coins, @Query("tsyms") String currency);

    @GET("data/price?")
    Call<ETH_TRANS> loadETHExchange(@Query("fsym") String coins, @Query("tsyms") String currency);

}
