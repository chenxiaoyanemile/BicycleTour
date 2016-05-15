package com.example.lenovo.bicycle.view;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.lenovo.bicycle.R;
import com.example.lenovo.bicycle.main.MyActivity;

public class loginActivity extends Activity {

    Button bt_login;
    private EditText et_account;
    private EditText et_password;
    private SharedPreferences pref;
    private SharedPreferences.Editor editor;
    private CheckBox rememberPass;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT < 16) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
        setContentView(R.layout.activity_login);

        pref  = PreferenceManager.getDefaultSharedPreferences(this);
        bt_login=(Button)findViewById(R.id.bt_login);
        et_account=(EditText)findViewById(R.id.et_account);
        et_password=(EditText)findViewById(R.id.et_password);
        rememberPass = (CheckBox)findViewById(R.id.remember_Pass);
        Boolean isRemember = pref.getBoolean("remember_password",false);
        if(isRemember){
            //将账号和密码都设置到文本框中
            String account = pref.getString("account","");
            String password = pref.getString("password","");
            et_account.setText(account);
            et_password.setText(password);
            rememberPass.setChecked(true);
        }

         bt_login.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          String account = et_account.getText().toString();
          String password = et_password.getText().toString();
          if (account.equals("123456")&& password.equals("123456") ){
              editor = pref.edit();
              if (rememberPass.isChecked()){
                  //检查复选框是否被选中
                  editor.putBoolean("remember_password",true);
                  editor.putString("account",account);
                  editor.putString("password",password);
              }else {
                  editor.clear();
              }
              editor.commit();
              Intent intent = new Intent(loginActivity.this, MyActivity.class);
              startActivity(intent);
              finish();
          }else{
              Toast.makeText(loginActivity.this,"account or password is invalid",Toast.LENGTH_SHORT).show();
          }
      }
  });
    }


}
