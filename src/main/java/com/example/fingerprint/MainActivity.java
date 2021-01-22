package com.example.fingerprint;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout RelativeLayout_systemsettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout_systemsettings = findViewById(R.id.RelativeLayout_systemsettings);
       // cardview_userinfo = findViewById(R.id.cardview_userinfo);

        RelativeLayout_systemsettings.setClickable(true);
        RelativeLayout_systemsettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SystemSettingsActivity.class);
                startActivity(intent);
            }
        });
    }
}