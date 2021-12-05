package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.app.AlertDialog;


public class LoginActivity extends AppCompatActivity {
    private EditText un;
    private EditText pwd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        un=(EditText) findViewById(R.id.text_1);
        pwd=(EditText) findViewById(R.id.text_2);
        Button login = (Button) findViewById(R.id.button_3);
        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String username = un.getText().toString();
                String passwd = pwd.getText().toString();
                if(("admin").equals(username)&&("admin").equals(passwd)){
                    Intent intent = new Intent(LoginActivity.this,SuccessActivity.class);
                    startActivity(intent);
                    finish();
                }
                else{
                    AlertDialog.Builder dialog = new AlertDialog.Builder(LoginActivity.this);
                    dialog.setTitle("错误");
                    dialog.setMessage("用户名或密码错误！");
                    dialog.setCancelable(false);
                    dialog.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });
                    dialog.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });
                    dialog.show();
                }
            }
        });

    }
}
