package com.example.lenovo.bicycle.model;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.WindowManager;

import com.example.lenovo.bicycle.R;

public class RentBikeKidActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT < 16) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
        setContentView(R.layout.activity_rentbikekid);

    }



}
