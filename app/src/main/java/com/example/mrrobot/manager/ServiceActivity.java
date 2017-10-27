package com.example.mrrobot.manager;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ServiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        ImageButton imgButton = (ImageButton)findViewById(R.id.imageButton5);

        TabLayout tLayout = (TabLayout)findViewById(R.id.tabLayout);
        tLayout.getTabAt(1).select();

        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), UserActivity.class);
                startActivity(i);
            }
        });

        tLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Intent i = null;
                switch (tab.getPosition()) {
                    case 0:
                        i = new Intent(getApplicationContext(), MainActivity.class);
                        break;
                    case 1:
                        i = new Intent(getApplicationContext(), ServiceActivity.class);
                        break;
                    case 2: i = new Intent(getApplicationContext(), StylishActivity.class);
                        break;
                    case 3: i = new Intent(getApplicationContext(), ReviewActivity.class);
                        break;
                    case 4: i = new Intent(getApplicationContext(), PromoActivity.class);
                        break;
                }
                startActivity(i);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
