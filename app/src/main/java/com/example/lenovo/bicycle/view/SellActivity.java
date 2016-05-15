package com.example.lenovo.bicycle.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.lenovo.bicycle.R;

public class SellActivity extends Activity {

    private String[] data = {"行车名称:","价格:","几成新:","使用年限:","对它的描述:","照片:","你的建议:","联系方式:","支付方式:"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                SellActivity.this,android.R.layout.simple_list_item_1,data);
        ListView listView = (ListView) findViewById(R.id.lv_seller);
        listView.setAdapter(adapter);
    }

}
