package com.teamproject.foodrecommendations;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {

    //서버 URL 설정(php 파일 연동)
    final static private String URL = "http://taeinhost.dothome.co.kr/Register.php";
    private Map<String, String>map;

    public RegisterRequest(String uId, String uPassword, String uName, String uEmail, String uAddress , String uGender, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);

        map = new HashMap<>();
        map.put("uId", uId);
        map.put("uPassword", uPassword);
        map.put("uName", uName);
        map.put("uEmail", uEmail);
        map.put("uAddress", uAddress);
        map.put("uGender", uGender);
    }

    @Override
    protected Map<String, String>getParams() throws AuthFailureError {
        return map;
    }
}

