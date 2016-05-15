package com.example.lenovo.bicycle.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.lenovo.bicycle.R;
import com.example.lenovo.bicycle.view.BuyActivity;
import com.example.lenovo.bicycle.view.ManServiceActivity;
import com.example.lenovo.bicycle.view.RentActivity;
import com.example.lenovo.bicycle.view.SellActivity;
import com.example.lenovo.bicycle.view.loginActivity;


public class MyActivity extends Activity {

     Button bt_login;
     Button btn_rent;
     Button btn_buy;
     Button btn_sell;
     Button btn_dabing;
     Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        Log.d("MyActivity","onCreate");


        bt_login=(Button)findViewById(R.id.bt_login);
        btn_rent=(Button)findViewById(R.id.btn_rent);
        btn_buy=(Button)findViewById(R.id.btn_buy);
        btn_sell=(Button)findViewById(R.id.btn_sell);
        btn_dabing=(Button)findViewById(R.id.btn_dabing);
        btn_back = (Button)findViewById(R.id.btn_back);

        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyActivity.this, loginActivity.class);
                startActivity(intent);
                Log.d("MyActivity","loginActivity");


            }
        });
        btn_rent.setOnClickListener(new View.OnClickListener(){
            @Override
        public void onClick(View v){
                Intent intent = new Intent(MyActivity.this, RentActivity.class);
                startActivity(intent);
                Log.d("MyActivity","rentActivity");

            }
        });
        btn_buy.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MyActivity.this, BuyActivity.class);
                startActivity(intent);
                Log.d("MyActivity","buyActivity");


            }
        });
        btn_sell.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MyActivity.this, SellActivity.class);
                startActivity(intent);
                Log.d("MyActivity","sellActivity");


            }
        });
        btn_dabing.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MyActivity.this, ManServiceActivity.class);
                startActivity(intent);
                Log.d("MyActivity","ManServiceActivity");

            }
        });
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MyActivity.this,"再按一次退出程序",Toast.LENGTH_SHORT).show();

            }
        });




    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("MyActivity","onStart");
    }
    @Override
    protected void onResume(){
        super.onStart();
        Log.d("MyActivity","onResume");
    }
    @Override
    protected void onPause(){
        super.onStart();
        Log.d("MyActivity","onPause");
    }
    @Override
    protected void onStop(){
        super.onStart();
        Log.d("MyActivity","onStop");
    }
    @Override
    protected void onDestroy(){
        super.onStart();
        Log.d("MyActivity","onDestroy");
    }
    @Override
    protected void onRestart(){
        super.onStart();
        Log.d("MyActivity","onRestart");
    }


}
