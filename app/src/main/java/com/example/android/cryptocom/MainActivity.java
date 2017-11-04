package com.example.android.cryptocom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.cryptocom.Adapters.CustomCoinAdapter;
import com.example.android.cryptocom.Staged.CoinList;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    CustomCoinAdapter adapter;
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.coins_list);
        adapter = new CustomCoinAdapter(this, getData());
        list.setAdapter(adapter);

    }

    private ArrayList getData() {
        ArrayList<CoinList> coinListModels = new ArrayList<>();
        CoinList coinListModel = new CoinList();

        coinListModel.setCoinImage(R.drawable.bitcoin);
        coinListModel.setCoinName("Bitcoin");
        coinListModel.setCoinCode("BTC");
        coinListModels.add(coinListModel);

        coinListModel = new CoinList();
        coinListModel.setCoinImage(R.drawable.ethereum);
        coinListModel.setCoinName("Ethereum");
        coinListModel.setCoinCode("ETH");
        coinListModels.add(coinListModel);

        return coinListModels;
    }

}
