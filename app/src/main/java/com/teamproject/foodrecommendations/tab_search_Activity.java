package com.teamproject.foodrecommendations;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class tab_search_Activity extends AppCompatActivity {
    ListView listview = null ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_search_activity);

        final ListViewAdapter adapter;

        // Adapter 생성
        adapter = new ListViewAdapter() ;

        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) findViewById(R.id.listview1);
        listview.setAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.food1),
                "떡볶이", "떡볶이 맛집 검색") ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.food2),
                "라면", "라면 맛집 검색") ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.food3),
                "짜장면", "짜장면 맛집 검색") ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.food4),
                "족발", "족발 맛집 검색") ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.food5),
                "오므라이스", "오므라이스 맛집 검색") ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.food6),
                "삼계탕", "삼계탕 맛집 검색") ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.food7),
                "떡국", "떡국 맛집 검색") ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.food8),
                "피자", "피자 맛집 검색") ;

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0 :
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EB%96%A1%EB%B3%B6%EC%9D%B4"));
                        startActivity(intent);
                    case 1 :
                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EB%9D%BC%EB%A9%B4+%EB%A7%9B%EC%A7%91"));
                        startActivity(intent);
                    case 2 :
                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EC%A7%9C%EC%9E%A5%EB%A9%B4+%EB%A7%9B%EC%A7%91&oquery=%EB%9D%BC%EB%A9%B4+%EB%A7%9B%EC%A7%91&tqi=haX1hlp0YidssQleR%2BdssssssWR-022915"));
                        startActivity(intent);
                    case 3 :
                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EC%A1%B1%EB%B0%9C+%EB%A7%9B%EC%A7%91&oquery=%EC%A1%B1%EB%B0%9C+%EB%A7%9B%EC%A7%90&tqi=haX1Adp0J1sssksTvxdssssst0N-114715"));
                        startActivity(intent);
                    case 4 :
                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EC%A1%B1%EB%B0%9C+%EB%A7%9B%EC%A7%91"));
                        startActivity(intent);
                    case 5 :
                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EC%98%A4%EB%AF%80%EB%9D%BC%EC%9D%B4%EC%8A%A4+%EB%A7%9B%EC%A7%91&oquery=%EC%A1%B1%EB%B0%9C+%EB%A7%9B%EC%A7%91&tqi=haX1Xsp0JywssgnPp5dssssss1s-254421"));
                        startActivity(intent);
                    case 6 :
                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EC%82%BC%EA%B3%84%ED%83%95+%EB%A7%9B%EC%A7%91&oquery=%EC%98%A4%EB%AF%80%EB%9D%BC%EC%9D%B4%EC%8A%A4+%EB%A7%9B%EC%A7%91&tqi=haX1xdp0YidssQq%2FGb0ssssstaw-057565"));
                        startActivity(intent);
                    case 7 :
                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EB%96%A1%EA%B5%AD+%EB%A7%9B%EC%A7%91&oquery=%EC%82%BC%EA%B3%84%ED%83%95+%EB%A7%9B%EC%A7%91&tqi=haX10dp0JXosssYhLpssssssstK-123659"));
                        startActivity(intent);
                    case 8 :
                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%ED%94%BC%EC%9E%90+%EB%A7%9B%EC%A7%91&oquery=%EB%96%A1%EA%B5%AD+%EB%A7%9B%EC%A7%91&tqi=haX13sp0JXVssmE4QVKssssssMC-129796"));
                        startActivity(intent);
                }
            }
        });

        EditText editTextFilter = (EditText)findViewById(R.id.editTextFilter) ;
        editTextFilter.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable edit) {
                String filterText = edit.toString() ;
                if (filterText.length() > 0) {
                    listview.setFilterText(filterText) ;
                } else {
                    listview.clearTextFilter() ;
                }
            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        }) ;
    }
}
