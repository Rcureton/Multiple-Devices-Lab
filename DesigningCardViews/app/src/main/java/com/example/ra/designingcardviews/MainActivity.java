package com.example.ra.designingcardviews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ListView mListview;
    ArrayAdapter<String> mAdapter;
    ArrayList<String> mList;
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cardlist_port);

        mButton=(Button)findViewById(R.id.button);


        mListview= (ListView)findViewById(R.id.listView);
        mList= new ArrayList<String>();
        mList.add("ONE");
        mList.add("TWO");
        mList.add("THREE");
        mList.add("FOUR");
        mList.add("FIVE");

        mAdapter= new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,mList);
        mListview.setAdapter(mAdapter);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,CalView.class);
                startActivity(intent);
            }
        });




    }
}
