package com.teamproject.foodrecommendations;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;


public class tab_my_Activity extends AppCompatActivity {

    private TextView tv_id, tv_pass, tv_name, tv_email;
    private  Button btn_login, btn_register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.tab_my_activity );


            tv_id = findViewById(R.id.tv_id);
            tv_pass = findViewById(R.id.tv_pass);
            tv_name = findViewById(R.id.tv_name);
            tv_email = findViewById(R.id.tv_email);


            Intent intent = getIntent();
            String uId = intent.getStringExtra("uId");
            String uPassword = intent.getStringExtra("uPassword");
            String uName = intent.getStringExtra("uName");
            String uEmail = intent.getStringExtra("uEmail");
            String uAddress = intent.getStringExtra("uAddress");
            String uGender = intent.getStringExtra("uGender");


            tv_id.setText(uId);
            tv_pass.setText(uPassword);
            tv_name.setText(uName);
            tv_email.setText(uEmail);

            //로그인 화면으로 이동
             btn_login = findViewById(R.id.btn_login);
             btn_register = findViewById(R.id.btn_register);
             btn_login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent1 = new Intent(getApplicationContext(), LoginActivity.class);
                    startActivity(intent1);
                }
            });
             btn_register.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     Intent intent1 = new Intent(getApplicationContext(), RegisterActivity.class);
                     startActivity(intent1);
                 }
             });
    }
}
