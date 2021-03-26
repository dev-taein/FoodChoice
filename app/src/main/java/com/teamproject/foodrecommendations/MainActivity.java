package com.teamproject.foodrecommendations;

import android.app.TabActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.TabHost;


public class MainActivity extends  TabActivity { //AppCompatActivity,
    public static TabHost tabHost;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("FoodChoice");

        final TabHost tabHost = getTabHost();
        TabHost.TabSpec spec;
        // 탭라인 제거
        tabHost.getTabWidget().setDividerDrawable(null);

        // 탭에 넣을 이미지들 설정
        ImageView tabwidget01 = new ImageView(this);
        tabwidget01.setImageResource(R.drawable.tab_home);

        ImageView tabwidget02 = new ImageView(this);
        tabwidget02.setImageResource(R.drawable.tab_search);

        ImageView tabwidget03 = new ImageView(this);
        tabwidget03.setImageResource(R.drawable.tab_location);

        ImageView tabwidget04 = new ImageView(this);
        tabwidget04.setImageResource(R.drawable.tab_my);

        // 탭에 이미지 생성한것 넣어주고 Intent로 이동
        spec = tabHost.newTabSpec("tab_home").setIndicator(tabwidget01)
                .setContent(new Intent(this, tab_home_Activity.class));
        tabHost.addTab(spec);

        spec = tabHost.newTabSpec("tab_search").setIndicator(tabwidget02)
                .setContent(new Intent(this, tab_search_Activity.class));
        tabHost.addTab(spec);

        spec = tabHost.newTabSpec("tab_location").setIndicator(tabwidget03)
                .setContent(new Intent(this, tab_location_Activity.class));
        tabHost.addTab(spec);

        spec = tabHost.newTabSpec("tab_my").setIndicator(tabwidget04)
                .setContent(new Intent(this, tab_my_Activity.class));
        tabHost.addTab(spec);

        tabHost.setCurrentTab(0);

        // 탭 배경색 설정!(빈공간 생기는 것 때문에)
        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                for (int i = 0; i < tabHost.getTabWidget().getChildCount(); i++) {
                    tabHost.getTabWidget().getChildAt(i)
                            .setBackgroundColor(Color.parseColor("#255187"));
                }
                tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab())
                        .setBackgroundColor(Color.parseColor("#4f81bd"));
            }
        });

        // 탭의 높이 설정
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        int screenHeight = metrics.heightPixels;
        tabHost.getTabWidget().getChildAt(0).getLayoutParams().height = (screenHeight * 15) / 200;
        tabHost.getTabWidget().getChildAt(1).getLayoutParams().height = (screenHeight * 15) / 200;
        tabHost.getTabWidget().getChildAt(2).getLayoutParams().height = (screenHeight * 15) / 200;
        tabHost.getTabWidget().getChildAt(3).getLayoutParams().height = (screenHeight * 15) / 200;
    }

}
