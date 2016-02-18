package com.example.ra.designingcardviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class CalView extends AppCompatActivity {
    ArrayList<String> mCalArray;
    ArrayList<String> mDays;
    ArrayAdapter<String> mDaysAdapter;
    ArrayAdapter<String> mCalAdapter;
    ListView mListView;
    ListView mListview2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_view);

        mListView= (ListView)findViewById(R.id.listView2);
        mCalArray= new ArrayList<String>();
        mCalArray.add("Wednesday");
        mCalArray.add("Thursday");
        mCalArray.add("Friday");
        mCalArray.add("Saturday");


        mCalAdapter= new ArrayAdapter<String>(CalView.this,android.R.layout.simple_list_item_1,mCalArray);
        mListView.setAdapter(mCalAdapter);

        mListview2=(ListView)findViewById(R.id.listView3);
        mDays= new ArrayList<String>();
        mDays.add("17 Wed");
        mDays.add("18 Thurs");
        mDays.add("19 Fri");
        mDays.add("20 Sat");

        mDaysAdapter= new ArrayAdapter<String>(CalView.this,android.R.layout.simple_list_item_1,mDays);
        mListview2.setAdapter(mDaysAdapter);

    }
}
