package com.teamproject.foodrecommendations;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class LoginActivity extends AppCompatActivity {

    private EditText et_id, et_pass;
    private Button btn_login, btn_register;

    private AlertDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_login );

        et_id = findViewById( R.id.et_id );
        et_pass = findViewById( R.id.et_pass );


        //회원 가입 버튼 클릭 시 이벤트 처리
        btn_register = findViewById( R.id.btn_register );
        btn_register.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( LoginActivity.this, RegisterActivity.class );
                startActivity( intent );
            }
        });


        btn_login = findViewById( R.id.btn_login );
        btn_login.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uId = et_id.getText().toString();
                String uPassword = et_pass.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject( response );
                            boolean success = jsonObject.getBoolean( "success" );
                            //로그인 성공시
                            if(success) {

                                String uId = jsonObject.getString( "uId" );
                                String uPassword = jsonObject.getString( "uPassword" );
                                String uName = jsonObject.getString( "uName" );
                                String uEmail = jsonObject.getString( "uEmail" );

                                Toast.makeText( getApplicationContext(), "로그인 성공", Toast.LENGTH_SHORT ).show();
                                Intent intent = new Intent( LoginActivity.this, tab_my_Activity.class );


                                intent.putExtra( "uId", uId );
                                intent.putExtra( "uPassword", uPassword );
                                intent.putExtra( "uName", uName );
                                intent.putExtra( "uEmail", uEmail );

                                startActivity( intent );


                            } else {//로그인 실패시

                                Toast.makeText( getApplicationContext(), "로그인 실패", Toast.LENGTH_SHORT ).show();
                                return;
                            }

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                };
                LoginRequest loginRequest = new LoginRequest( uId, uPassword, responseListener );
                RequestQueue queue = Volley.newRequestQueue( LoginActivity.this );
                queue.add( loginRequest );

            }
        });
    }
}
