package com.example.android.cryptocom.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import com.example.android.cryptocom.R;
import com.example.android.cryptocom.Staged.CurrencyBTC;
import com.example.android.cryptocom.interfacces.BTCCurrencyItemClick;

import java.util.List;

/**
 * Created by USER on 10/31/2017.
 */

public class BTCAdapter extends BaseAdapter {


    private Context context;
    private LayoutInflater layoutInflater;
    private List<CurrencyBTC> currencyBTCs;
    private BTCCurrencyItemClick btcCurrencyItemClickListener;
    private int flagImages[];

    public BTCAdapter(Context context, List<CurrencyBTC> currencyBTCs, BTCCurrencyItemClick btcCurrencyItemClickListener, int[] flagImages) {
        this.context = context;
        this.currencyBTCs = currencyBTCs;
        this.btcCurrencyItemClickListener = btcCurrencyItemClickListener;
        this.flagImages = flagImages;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return currencyBTCs.size();
    }

    @Override
    public Object getItem(int position) {
        return currencyBTCs.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final View btcCurrencyItemView = layoutInflater.inflate(R.layout.btc_currency_item, null);
        TextView currencyName = (TextView) btcCurrencyItemView.findViewById(R.id.currency_name);
        TextView currencyAmount = (TextView) btcCurrencyItemView.findViewById(R.id.currency_amount);
        ImageView flagImage = (ImageView) btcCurrencyItemView.findViewById(R.id.flag_image_view_btc);

        Glide.with(context).load(flagImages[position]).into(flagImage);

        final CurrencyBTC currencyBTC = currencyBTCs.get(position);
        currencyName.setText(currencyBTC.getName());
        currencyAmount.setText(Double.toString(currencyBTC.getRate()));

        btcCurrencyItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btcCurrencyItemClickListener.onBTCCurrencyItemClick(currencyBTC);
            }
        });
        return btcCurrencyItemView;
    }
}

