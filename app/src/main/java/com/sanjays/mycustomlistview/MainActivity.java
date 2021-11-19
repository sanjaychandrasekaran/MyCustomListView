package com.sanjays.mycustomlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//     to create listview
    ListView listView;

//    creating data
    String[] title = {
           "Master Android Pro App",
           "Master Android Flutter App",
           "Master Android App",
           "Youtube channel",
           "Rate Us"

};

//    creating description

    String[] description = {
            "Learn Android app development from zero to Hero",
            "Learn Flutter from scratch from zero to Hero",
            "Learn Android app pro development from zero to Hero",
            "Android master app is our official channel",
            "Keep us making new tutorials,Rate us 5 stars on Udemy"
    };
//    Images as an array
    Integer[] images = {
            R.drawable.fbb,
        R.drawable.gg,
        R.drawable.tr,
        R.drawable.green,
        R.drawable.redbus_logo__1_

};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        to get id
        MyListAdapter adapter = new MyListAdapter(this,title,description,images);

        listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

//        adding a click listener for a items
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Item 0 selected:
                if(position == 0){
                    Toast.makeText(MainActivity.this, "Item 1 selected", Toast.LENGTH_SHORT).show();
                }
//                Item 1 selected:
                if(position == 1){
                    Toast.makeText(MainActivity.this, "Item 2 selected", Toast.LENGTH_SHORT).show();
                }
//                Item 2 selected:
                if(position == 2){
                    Toast.makeText(MainActivity.this, "Item 3 selected", Toast.LENGTH_SHORT).show();
                }
//                Item 3 selected:
                if(position == 3){
                    Toast.makeText(MainActivity.this, "Item 4 selected", Toast.LENGTH_SHORT).show();
                }
//                Item 4 selected:
             if(position == 4){
                   Toast.makeText(MainActivity.this, "Item 5 selected", Toast.LENGTH_SHORT).show();
               }
           }
        });

    }
}