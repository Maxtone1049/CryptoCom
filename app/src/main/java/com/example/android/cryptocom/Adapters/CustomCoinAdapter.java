package com.example.android.cryptocom.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.cryptocom.BTCActivity;
import com.example.android.cryptocom.EthActivity;
import com.example.android.cryptocom.R;
import com.example.android.cryptocom.Staged.CoinList;

import java.util.ArrayList;

/**
 * Created by USER on 10/31/2017.
 */

public class CustomCoinAdapter extends BaseAdapter {

    Context mContext;
    Intent myIntent;

    ArrayList<CoinList> coinListModels;

    public CustomCoinAdapter(Context context, ArrayList<CoinList> coinListModels) {
        this.mContext = context;
        this.coinListModels = coinListModels;
    }

    @Override
    public int getCount() {
        return coinListModels.size();
    }

    @Override
    public Object getItem(int position) {
        return coinListModels.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.coin_model, parent, false);
        }
        final CoinList coinListModel = (CoinList) this.getItem(position);
        ImageView coinImage = (ImageView) convertView.findViewById(R.id.coinImage);
        TextView coinName = (TextView) convertView.findViewById(R.id.coin_name);
        TextView coinCode = (TextView) convertView.findViewById(R.id.coin_code);
        coinName.setText(coinListModel.getCoinName());
        coinCode.setText(coinListModel.getCoinCode());
        coinImage.setImageResource(coinListModel.getCoinImage());
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                switch (position) {
                    case 0:
                        myIntent = new Intent(mContext, BTCActivity.class);
                        context.startActivity(myIntent);
                        break;

                    case 1:
                        myIntent = new Intent(mContext, EthActivity.class);
                        context.startActivity(myIntent);
                        break;

                }
            }
        });
        return convertView;
    }
}
