package com.sanjays.mycustomlistview;


import android.app.Activity;
import android.content.Context;
import android.graphics.ImageDecoder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;



public class MyListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] mainTitle;
    private final String[] description;
    private final Integer[] images;

//  Constructor

    public MyListAdapter(@NonNull Activity context1, String[] title, String[] description, Integer[] images) {
        super(context1, R.layout.item_custom_layout,title);
        this.context = context1;
        this.mainTitle = title;
        this.description = description;
        this.images = images;
    }


    public View getView(int position, View view, ViewGroup parent){

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.item_custom_layout,null,true);

        TextView titleText = rowView.findViewById(R.id.title);
        TextView titleSubText = rowView.findViewById(R.id.subtitle);
        ImageView titleIcon = rowView.findViewById(R.id.icon);

       titleText.setText(mainTitle[position]);
       titleSubText.setText(description[position]);
      titleIcon.setImageResource(images[position]);

//        View rowview;
        return rowView;
    };



}
