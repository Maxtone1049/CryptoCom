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

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import com.example.android.cryptocom.Adapters.BTCAdapter;
import com.example.android.cryptocom.Staged.CurrencyBTC;
import com.example.android.cryptocom.TRANS.BTC_TRANS;
import com.example.android.cryptocom.interfacces.BTCCurrencyItemClick;
import com.example.android.cryptocom.interfacces.CoinExchangeDuty;

/**
 * Created by USER on 10/31/2017.
 */

public class BTCActivity extends AppCompatActivity implements Callback<BTC_TRANS>, BTCCurrencyItemClick {

    String fsym = "BTC";
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
    private ImageView flagpic;
    private ImageView network;
    private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btc);
        currencyList = (ListView) findViewById(R.id.btc_currency_list);
        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        flagpic = (ImageView) findViewById(R.id.flag_image_view_btc);
        network = (ImageView) findViewById(R.id.btc_wifi);
    }

    @Override
    protected void onStart() {
        super.onStart();
        progressBar.setVisibility(View.VISIBLE);
        loadBTCExchangeData();
    }

    private void loadBTCExchangeData() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://min-api.cryptocompare.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        CoinExchangeDuty service = retrofit.create(CoinExchangeDuty.class);
        Call<BTC_TRANS> call = service.loadBTCExchange(fsym, tsyms);
        call.enqueue(this);
    }


    @Override
    public void onResponse(Call<BTC_TRANS> call, Response<BTC_TRANS> response) {
        progressBar.setVisibility(View.GONE);
        network.setVisibility(View.GONE);
        BTC_TRANS btc_trans = response.body();
        currencyList.setAdapter(new BTCAdapter(this, btc_trans.getCurrencyBTCList(), this, flagImages));
    }

    @Override
    public void onFailure(Call<BTC_TRANS> call, Throwable t) {
        progressBar.setVisibility(View.INVISIBLE);
        network.setVisibility(View.VISIBLE);
        Toast.makeText(this, "Sorry Data Could Not Be Fecthed. Reconnect", Toast.LENGTH_LONG).show();

    }

    @Override
    public void onBTCCurrencyItemClick(CurrencyBTC currencyBTC) {

        Intent intent = new Intent(this, BTCConversion.class);
        intent.putExtra("currency_name", currencyBTC.getName());
        intent.putExtra("currency_rate", currencyBTC.getRate());
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
            loadBTCExchangeData();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}

