package com.example.lenovo.bicycle.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.example.lenovo.bicycle.R;

public class BuyActivity extends Activity {

    private Button btn_newbike;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);

        btn_newbike = (Button)findViewById(R.id.btn_newbike);
        btn_newbike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BuyActivity.this, NewBicycle.class);
                startActivity(intent);

            }
        });
    }


}
