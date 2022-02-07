package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class PhoneInfo extends AppCompatActivity {

    Button btnActOne;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_info);btnActOne = (Button) findViewById(R.id.btnActOne);
        btnActOne.setOnClickListener(this::onClick);
        ListView listView = findViewById(R.id. list ) ;
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, PhoneInfo);
        listView.setAdapter(adapter);
    }

    final String[] PhoneInfo = new String[]
            {
                    getPhoneModel (), getPhoneManufacturer (), getPhoneOSRelease ()
            };
    private String getPhoneModel () {
        return "Phone Model: " + Build.MODEL;
    }
    private String getPhoneManufacturer () {
        return "Manufacturer: " + Build.MANUFACTURER;
    }
    private String getPhoneOSRelease ()  {
        return "AndroidVersion: " + Build.VERSION.RELEASE;
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnActOne:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}