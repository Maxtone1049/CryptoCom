package com.example.android.cryptocom.Adapters;

/**
 * Created by USER on 10/31/2017.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.android.cryptocom.R;
import com.example.android.cryptocom.Staged.CurrencyETH;
import com.example.android.cryptocom.interfacces.ETHCurrencyItemClick;


import java.util.List;


public class ETHAdapter extends BaseAdapter {


    private Context context;
    private LayoutInflater layoutInflater;
    private List<CurrencyETH> currencyETHs;
    private ETHCurrencyItemClick ethCurrencyItemClickListener;
    private int flagImages[];

    public ETHAdapter(Context context, List<CurrencyETH> currencyETHs, ETHCurrencyItemClick ethCurrencyItemClickListener, int[] flagImages) {
        this.context = context;
        this.currencyETHs = currencyETHs;
        this.ethCurrencyItemClickListener = ethCurrencyItemClickListener;
        this.flagImages = flagImages;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return currencyETHs.size();
    }

    @Override
    public Object getItem(int position) {
        return currencyETHs.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final View ethCurrencyItemView = layoutInflater.inflate(R.layout.eth_currency_item, null);
        TextView currencyName = (TextView) ethCurrencyItemView.findViewById(R.id.currency_name);
        TextView currencyAmount = (TextView) ethCurrencyItemView.findViewById(R.id.currency_amount);
        ImageView flagImage = (ImageView) ethCurrencyItemView.findViewById(R.id.flag_image_view_eth);
        Glide.with(context).load(flagImages[position]).into(flagImage);

        final CurrencyETH currencyETH = currencyETHs.get(position);
        currencyName.setText(currencyETH.getName());
        currencyAmount.setText(Double.toString(currencyETH.getRate()));

        ethCurrencyItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ethCurrencyItemClickListener.onETHCurrencyItemClick(currencyETH);
            }
        });
        return ethCurrencyItemView;
    }
}

