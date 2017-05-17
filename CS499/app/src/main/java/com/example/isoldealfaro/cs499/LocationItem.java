package com.example.isoldealfaro.cs499;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LocationItem extends AppCompatActivity {

    private String name;
    private String address;
    private String residency;
    private String price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_item);
    }

    public LocationItem () {

    }

    public LocationItem(String name, String address, String residency, String price) {
        this.name = name;
        this.address = address;
        this.residency = residency;
        this.price = price;

    }

    public String getName() {
        return name;
    }
}
