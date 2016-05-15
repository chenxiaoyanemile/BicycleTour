package com.example.lenovo.bicycle.model;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

import com.example.lenovo.bicycle.R;

public class RentBikeMountainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rent_bike_mountain);


    }




}
