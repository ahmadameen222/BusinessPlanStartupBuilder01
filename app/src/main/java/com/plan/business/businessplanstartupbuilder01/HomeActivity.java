package com.plan.business.businessplanstartupbuilder01;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.plan.business.businessplanstartupbuilder01.Fragments.*;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);






        TextView home = (TextView)findViewById(R.id.home);
        TextView ideas = (TextView)findViewById(R.id.ideas);
        TextView plan = (TextView)findViewById(R.id.plan);
        TextView chat = (TextView)findViewById(R.id.chat);


        Fragment firstFragment = new HomeFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.home_fragment, firstFragment).commit();


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment firstFragment = new HomeFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.home_fragment, firstFragment).commit();

            }
        });


        ideas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment firstFragment = new IdeasFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.home_fragment, firstFragment).commit();

            }
        });


        plan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment firstFragment = new PlanFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.home_fragment, firstFragment).commit();

            }
        });

        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment firstFragment = new ChatFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.home_fragment, firstFragment).commit();

            }
        });




    }
}
