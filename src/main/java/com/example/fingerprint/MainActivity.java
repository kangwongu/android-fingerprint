package com.example.fingerprint;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    // 컴포넌트들을 매칭하기 위한 변수 선언
    RelativeLayout RelativeLayout_systemsettings, RelativeLayout_uesrinfo;
    Toolbar toolbar;
    ActionBar actionBar;
    //Menu menu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayShowCustomEnabled(true);




        // activity_main.xml의 컴포넌트들을 변수와 매칭
        RelativeLayout_systemsettings = findViewById(R.id.RelativeLayout_systemsettings);
        RelativeLayout_uesrinfo = findViewById(R.id.RelativeLayout_userinfomation);
       // cardview_userinfo = findViewById(R.id.cardview_userinfo);

        // 클릭 가능하게 설정, 클릭 시 화면전환
        RelativeLayout_systemsettings.setClickable(true);
        RelativeLayout_systemsettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SystemSettingsActivity.class);
                startActivity(intent);
            }
        });

        RelativeLayout_uesrinfo.setClickable(true);
        RelativeLayout_uesrinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UserInfomationActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.barmenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.logout:
                break;
            case R.id.account:
                break;
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }


}