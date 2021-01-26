package com.example.fingerprint;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class UserInfomationActivity extends AppCompatActivity {

    RelativeLayout RelativeLayout_useraccesbility, RelativeLayout_userfingerprintapply, RelativeLayout_userfingerprintdelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userinfomation);

        Intent intent = getIntent();

        // xml컴포넌트와 변수 매칭
        RelativeLayout_useraccesbility = findViewById(R.id.RelativeLayout_useraccesbility);
        RelativeLayout_userfingerprintapply = findViewById(R.id.RelativeLayout_userfingerprintapply);
        RelativeLayout_userfingerprintdelete = findViewById(R.id.RelativeLayout_userfingerprintdelete);

        // 버튼 클릭 활성화, 클릭 시 화면전환
        RelativeLayout_useraccesbility.setClickable(true);
        RelativeLayout_useraccesbility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserInfomationActivity.this, UserAccesbilityActivity.class);
                startActivity(intent);
            }
        });

        RelativeLayout_userfingerprintapply.setClickable(true);
        RelativeLayout_userfingerprintapply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserInfomationActivity.this, UserFingerPrintApplyActivity.class);
                startActivity(intent);
            }
        });

        RelativeLayout_userfingerprintdelete.setClickable(true);
        RelativeLayout_userfingerprintdelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserInfomationActivity.this, UserFingerPrintDeleteActivity.class);
                startActivity(intent);
            }
        });
    }
}