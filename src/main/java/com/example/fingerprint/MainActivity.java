package com.example.fingerprint;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    // 컴포넌트들을 매칭하기 위한 변수 선언
    RelativeLayout RelativeLayout_systemsettings, RelativeLayout_uesrinfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // activity_main.xml의 컴포넌트들을 변수와 매칭
        RelativeLayout_systemsettings = findViewById(R.id.RelativeLayout_systemsettings);
        RelativeLayout_uesrinfo = findViewById(R.id.RelativeLayout_userinfo);
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
}