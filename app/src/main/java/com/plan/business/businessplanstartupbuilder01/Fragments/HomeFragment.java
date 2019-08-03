package com.plan.business.businessplanstartupbuilder01.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.plan.business.businessplanstartupbuilder01.R;


public class HomeFragment extends Fragment {


    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        Button btn1 = (Button) v.findViewById(R.id.PlanBusiness);
        Button btn2 = (Button) v.findViewById(R.id.ExecuteBusiness);
        //Button btn3 = (Button) v.findViewById(R.id.LiveChat);
        //Button btn4 = (Button) v.findViewById(R.id.LiveChat1);
        Button btn5 = (Button) v.findViewById(R.id.CreateRev);
        Button btn6 = (Button) v.findViewById(R.id.Marketing);
        Button btn7 = (Button) v.findViewById(R.id.ideasApp);
        Button btn8 = (Button) v.findViewById(R.id.networkBusiness);
        Button btn9 = (Button) v.findViewById(R.id.thinkBusiness);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Fragment NAME = new PlanFragment();
                fragmentTransaction.replace(R.id.home_fragment, NAME);
                fragmentTransaction.commit();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Fragment NAME = new ExecuteBusinessFragment();
                fragmentTransaction.replace(R.id.home_fragment, NAME);
                fragmentTransaction.commit();
            }
        });
        /*btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Fragment NAME = new PlanFragment();
                fragmentTransaction.replace(R.id.home_fragment, NAME);
                fragmentTransaction.commit();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Fragment NAME = new PlanFragment();
                fragmentTransaction.replace(R.id.home_fragment, NAME);
                fragmentTransaction.commit();
            }
        });*/

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Fragment NAME = new CreateRevFragment();
                fragmentTransaction.replace(R.id.home_fragment, NAME);
                fragmentTransaction.commit();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Fragment NAME = new MarketingFragment();
                fragmentTransaction.replace(R.id.home_fragment, NAME);
                fragmentTransaction.commit();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Fragment NAME = new IdeasFragment();
                fragmentTransaction.replace(R.id.home_fragment, NAME);
                fragmentTransaction.commit();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Fragment NAME = new NetworkingFragment();
                fragmentTransaction.replace(R.id.home_fragment, NAME);
                fragmentTransaction.commit();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Fragment NAME = new ThinkBusinessFragment();
                fragmentTransaction.replace(R.id.home_fragment, NAME);
                fragmentTransaction.commit();
            }
        });



        return v;
    }

}
