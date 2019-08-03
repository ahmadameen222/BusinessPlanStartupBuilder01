package com.plan.business.businessplanstartupbuilder01;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class LearnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

      /*
        businessApp.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.motivational.dell.moneymakingideas"))
            startActivity(browserIntent)
        }

        businessApp1.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.motivational.dell.moneymakingideas"))
            startActivity(browserIntent)
        }
*/

        Button businessApp = (Button)findViewById(R.id.businessApp);
        Button businessApp1 = (Button)findViewById(R.id.businessApp1);


        businessApp.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.motivational.dell.moneymakingideas"));
                startActivity(browserIntent);

            }
        });

        businessApp1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.motivational.dell.moneymakingideas"));
                startActivity(browserIntent);

            }
        });



    }
/*

    private void overrideFonts(final Context context, final View v) {
        try {
            if (v instanceof ViewGroup) {
                ViewGroup vg = (ViewGroup) v;
                for (int i = 0; i < vg.getChildCount(); i++) {
                    View child = vg.getChildAt(i);
                    overrideFonts(context, child);
                }
            } else if (v instanceof TextView) {
                ((TextView) v).setTypeface(Typeface.createFromAsset(context.getAssets(), "acme.xml"));
            }
        } catch (Exception e) {
        }
    }
*/

}
