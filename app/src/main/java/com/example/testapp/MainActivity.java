package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    static {
        System.loadLibrary("testapp");
    }

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ListView listView = findViewById(R.id. phone ) ;
        final ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, phone());
        listView.setAdapter(adapter);
        ListView listView1 = findViewById(R.id. name ) ;
        final ArrayAdapter<String> adapter1;
        adapter1 = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, name());
        listView1.setAdapter(adapter1);
    }
    private native String[] phone();
    private native String[] name();
}