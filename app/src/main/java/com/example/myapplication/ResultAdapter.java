package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ResultAdapter extends BaseAdapter {

    String strNum;
    Context context;

    public ResultAdapter(Context context, String strNum) {
        this.strNum = strNum;
        this.context = context;
    }

    @Override
    public int getCount() {
        return 10001;
    }

    @Override
    public Object getItem(int position) {
        return position + 1;
    }

    @Override
    public long getItemId(int position) {
        return position + 1;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        class ViewHolder{
            TextView textView;
            public ViewHolder(TextView textView){
                this.textView = textView;
            }
        }
        if (convertView == null) {
            convertView = LayoutInflater.from(context.getApplicationContext()).inflate(android.R.layout.simple_list_item_1, null);
            TextView tv = convertView.findViewById(android.R.id.text1);
            convertView.setTag(new ViewHolder(tv));
        }
        TextView numberTv = ((ViewHolder) (convertView.getTag())).textView;
        TextView numberTV = convertView.findViewById(android.R.id.text1);
        int i = position;
        String strNum = i + "";
        numberTV.setText(strNum);
        if (strNum.contains("3")) {
            numberTV.setTextColor(Color.RED);
            numberTV.setTextSize(30);
        } else {
            numberTV.setTextColor(Color.BLUE);
        }
        return convertView;
    }
}
