package com.teamproject.foodrecommendations;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class tab_home_Activity extends AppCompatActivity {
    ImageButton home_btn1, home_btn2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_home_activite);

        home_btn1 = findViewById(R.id.home_btn1);
        home_btn2 = findViewById(R.id.home_btn2);

        home_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), tab_location_Activity.class);
                startActivity(intent);
            }
        });

        home_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), tab_search_Activity.class);
                startActivity(intent);
            }
        });

    }
}