package com.example.fingerprint;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class SystemSettingsActivity extends AppCompatActivity {

    // xml의 컴포넌트 연결 위한 변수 선언
    RelativeLayout RelativeLayout_lockapplication, RelativeLayout_fingerprintmethod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system_settings);

        Intent intent = getIntent();

        // 변수와 xml컴포넌트들을 매칭
        RelativeLayout_lockapplication = findViewById(R.id.RelativeLayout_lockapplication);
        RelativeLayout_fingerprintmethod = findViewById(R.id.RelativeLayout_fingerprintmethod);

        // 버튼 클릭 가능하게 설정
        // 클릭 시, 액티비티 이동
        RelativeLayout_lockapplication.setClickable(true);
        RelativeLayout_lockapplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SystemSettingsActivity.this, LockApplicationActivity.class);
                startActivity(intent);
            }
        });

        RelativeLayout_fingerprintmethod.setClickable(true);
        RelativeLayout_fingerprintmethod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SystemSettingsActivity.this, FingerPrintMethodActivity.class);
                startActivity(intent);
            }
        });
    }
}