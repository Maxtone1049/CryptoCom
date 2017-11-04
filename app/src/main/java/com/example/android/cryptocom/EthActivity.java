package com.example.android.cryptocom;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.android.cryptocom.Adapters.ETHAdapter;
import com.example.android.cryptocom.Staged.CurrencyETH;
import com.example.android.cryptocom.TRANS.ETH_TRANS;
import com.example.android.cryptocom.interfacces.CoinExchangeDuty;
import com.example.android.cryptocom.interfacces.ETHCurrencyItemClick;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by USER on 10/31/2017.
 */

public class EthActivity extends AppCompatActivity implements Callback<ETH_TRANS>, ETHCurrencyItemClick {

    String fsym = "ETH";
    String tsyms = "NGN" + "," + "USD" +
            "," + "EUR" + "," + "JPY" + "," +
            "GBP" + "," + "AUD" + "," + "CAD" + "," +
            "CHF" + "," + "SEK" + "," + "NZD" + "," +
            "MXN" + "," + "SGD" + "," + "HKD" + "," +
            "NOK" + "," + "KRW" + "," + "TRY" + "," +
            "RUB" + "," + "INR" + "," + "BRL" + "," + "ZAR";
    int[] flagImages = new int[]{R.drawable.nigeria, R.drawable.usflag,
            R.drawable.europeflag, R.drawable.japan,
            R.drawable.britain, R.drawable.australia,
            R.drawable.canada, R.drawable.switzerland,
            R.drawable.sweden, R.drawable.newzealand,
            R.drawable.mexico, R.drawable.singapore,
            R.drawable.hongkong, R.drawable.norway,
            R.drawable.korea, R.drawable.turkey,
            R.drawable.russia, R.drawable.india,
            R.drawable.brazil, R.drawable.southafrica};
    private ListView currencyList;
    private ProgressBar progressBar;
    private ImageView ethWifi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eth);
        currencyList = (ListView) findViewById(R.id.eth_currency_list);
        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        ethWifi = (ImageView) findViewById(R.id.eth_wifi);

        loadETHExchangeData();
    }

    @Override
    protected void onStart() {
        super.onStart();
        progressBar.setVisibility(View.VISIBLE);
        loadETHExchangeData();
    }

    private void loadETHExchangeData() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://min-api.cryptocompare.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        CoinExchangeDuty service = retrofit.create(CoinExchangeDuty.class);
        Call<ETH_TRANS> call = service.loadETHExchange(fsym, tsyms);
        call.enqueue(this);
    }


    @Override
    public void onResponse(Call<ETH_TRANS> call, Response<ETH_TRANS> response) {
        progressBar.setVisibility(View.GONE);
        ethWifi.setVisibility(View.GONE);
        ETH_TRANS eth_trans = response.body();
        currencyList.setAdapter(new ETHAdapter(this, eth_trans.getCurrencyETHList(), this, flagImages));
    }

    @Override
    public void onFailure(Call<ETH_TRANS> call, Throwable t) {
        progressBar.setVisibility(View.GONE);
        ethWifi.setVisibility(View.VISIBLE);
        Toast.makeText(this, "Sorry Data Could Not Be Fecthed. Reconnect", Toast.LENGTH_LONG).show();

    }

    @Override
    public void onETHCurrencyItemClick(CurrencyETH currencyETH) {

        Intent intent = new Intent(this, ETHCONVERT.class);
        intent.putExtra("currency_name", currencyETH.getName());
        intent.putExtra("currency_rate", currencyETH.getRate());
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemThatWasClickedId = item.getItemId();
        if (itemThatWasClickedId == R.id.action_Refresh) {
            loadETHExchangeData();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}