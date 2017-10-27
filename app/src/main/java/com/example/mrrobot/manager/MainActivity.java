package com.example.mrrobot.manager;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.button2);
        ImageButton imageButton1 = (ImageButton)findViewById(R.id.imageButton5);
        TabLayout tLayout = (TabLayout)findViewById(R.id.tabLayout);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), BusinessDetailActivity.class);
                startActivity(i);
            }
        });

        imageButton1.setOnClickListener(new View.OnClickListener() {
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
