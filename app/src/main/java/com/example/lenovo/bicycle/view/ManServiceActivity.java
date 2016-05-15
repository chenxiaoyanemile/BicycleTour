package com.example.lenovo.bicycle.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.example.lenovo.bicycle.R;
import com.example.lenovo.bicycle.receiver.MessageActivity;

public class ManServiceActivity extends Activity {

    private Button btn_chat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_service);

        btn_chat = (Button) findViewById(R.id.btn_chat);
        btn_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManServiceActivity.this, MessageActivity.class);
                startActivity(intent);

            }
        });

    }




}
