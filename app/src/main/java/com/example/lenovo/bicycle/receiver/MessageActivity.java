package com.example.lenovo.bicycle.receiver;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.lenovo.bicycle.R;
import com.example.lenovo.bicycle.adapter.MagAdapter;

import java.util.ArrayList;
import java.util.List;

public class MessageActivity extends Activity {

    private ListView lv_msg;
    private EditText et_input;
    private Button btn_send;
    private MagAdapter adapter;
    private List<Msg>msgList = new ArrayList<Msg>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        initMsgs();//初始化消息数据
        adapter = new MagAdapter(MessageActivity.this,R.layout.mag_item,msgList);
        et_input = (EditText)findViewById(R.id.et_input);
        btn_send = (Button)findViewById(R.id.btn_send);
        lv_msg  = (ListView)findViewById(R.id.lv_msg);
        lv_msg.setAdapter(adapter);
        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = et_input.getText().toString();
                if (!"".equals(content)){
                    Msg msg = new Msg(content,Msg.TYPE_SEND);
                    msgList.add(msg);
                    adapter.notifyDataSetChanged();//当有新消息时，刷新ListView中的显示
                    lv_msg.setSelection(msgList.size());//将listview定位到最后一行
                    et_input.setText("");//清空输入框的内容
                }
            }
        });

    }

    private void initMsgs(){
        Msg mag1 = new Msg("Hello", Msg.TYPE_RECEIVED);
        msgList.add(mag1);
        Msg msg2 = new Msg("Hi",Msg.TYPE_SEND);
        msgList.add(msg2);
        Msg msg3 = new Msg("Welcome to bicycle tour",Msg.TYPE_RECEIVED);
        msgList.add(msg3);
    }



}
