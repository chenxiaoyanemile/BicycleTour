package com.example.lenovo.bicycle.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.example.lenovo.bicycle.R;
import com.example.lenovo.bicycle.model.RentBicycleActivity;
import com.example.lenovo.bicycle.model.RentBicycleTwoActivity;
import com.example.lenovo.bicycle.model.RentBikeKidActivity;
import com.example.lenovo.bicycle.model.RentBikeMountainActivity;

public class RentActivity extends Activity {

    Button btn_rentbike;
    Button btn_rentbike2;
    Button btn_rentbike3;
    Button btn_rentbike4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rent);

        btn_rentbike = (Button)findViewById(R.id.btn_rentbike);
        btn_rentbike2 = (Button)findViewById(R.id.btn_rentbike2);
        btn_rentbike3 = (Button)findViewById(R.id.btn_rentbike3);
        btn_rentbike4 = (Button)findViewById(R.id.btn_rentbike4);


        btn_rentbike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RentActivity.this, RentBicycleActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn_rentbike2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RentActivity.this, RentBicycleTwoActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn_rentbike3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RentActivity.this, RentBikeKidActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn_rentbike4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RentActivity.this, RentBikeMountainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }




}
