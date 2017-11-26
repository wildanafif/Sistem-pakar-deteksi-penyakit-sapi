package com.example.dimas.sispaksapi.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;

import com.example.dimas.sispaksapi.R;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wildan.afif on 11/19/2017.
 */

public class ListAdapaterGejala extends BaseAdapter{
    Context context;
    private List<String> gejala;

    public ListAdapaterGejala(Context context, List<String> gejala) {
        this.context = context;
        this.gejala = gejala;
    }

    @Override
    public int getCount() {
        return gejala.size();
    }

    @Override
    public Object getItem(int i) {
        return gejala.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View V= View.inflate(context, R.layout.list_jenis_gejala, null);
        CheckBox checkBox= (CheckBox)V.findViewById(R.id.gejalaCX);
        checkBox.setText(this.gejala.get(i));
        Map<String, Integer> inputan=new HashMap<String,Integer>();

        return V;
    }
}
