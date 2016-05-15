package com.example.lenovo.bicycle.model;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.example.lenovo.bicycle.R;
import com.example.lenovo.bicycle.main.MyActivity;

public class RentBicycleActivity extends Activity {

    private Button btn_RentBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rent_bicycle);
        Log.d("RentBicycleActivity","onCreate");

        btn_RentBack = (Button)findViewById(R.id.btn_RentBack);
        btn_RentBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RentBicycleActivity.this, MyActivity.class);
                startActivity(intent);

            }
        });

    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("RentBicycleActivity","onStart");
    }
    @Override
    protected void onResume(){
        super.onStart();
        Log.d("RentBicycleActivity","onResume");
    }
    @Override
    protected void onPause(){
        super.onStart();
        Log.d("RentBicycleActivity","onPause");
    }
    @Override
    protected void onStop(){
        super.onStart();
        Log.d("RentBicycleActivity","onStop");
    }
    @Override
    protected void onDestroy(){
        super.onStart();
        Log.d("RentBicycleActivity","onDestroy");
    }
    @Override
    protected void onRestart(){
        super.onStart();
        Log.d("RentBicycleActivity","onRestart");
    }





}
