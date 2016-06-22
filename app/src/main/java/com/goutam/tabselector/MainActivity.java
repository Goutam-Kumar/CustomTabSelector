package com.goutam.tabselector;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.goutam.tabselector.debughelper.LogCollection;

public class MainActivity extends AppCompatActivity {
    LogCollection logCollection;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        logCollection = new LogCollection(this);

        tabLayout.addTab(tabLayout.newTab().setText("1"));
        tabLayout.addTab(tabLayout.newTab().setText("2"));
        tabLayout.addTab(tabLayout.newTab().setText("3"));
        tabLayout.addTab(tabLayout.newTab().setText("4"));
        tabLayout.addTab(tabLayout.newTab().setText("5"));
        tabLayout.addTab(tabLayout.newTab().setText("6"));
        tabLayout.addTab(tabLayout.newTab().setText("7"));
        tabLayout.addTab(tabLayout.newTab().setText("8"));
        tabLayout.addTab(tabLayout.newTab().setText("9"));
        tabLayout.addTab(tabLayout.newTab().setText("10"));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tabLayout.getSelectedTabPosition() == 0){
                    logCollection.showToastLong("1");
                }else if (tabLayout.getSelectedTabPosition() == 1){
                    logCollection.showToastLong("2");
                }else if (tabLayout.getSelectedTabPosition() == 2){
                    logCollection.showToastLong("3");
                }else if (tabLayout.getSelectedTabPosition() == 3){
                    logCollection.showToastLong("4");
                }else if (tabLayout.getSelectedTabPosition() == 4){
                    logCollection.showToastLong("5");
                }else if (tabLayout.getSelectedTabPosition() == 5){
                    logCollection.showToastLong("6");
                }else if (tabLayout.getSelectedTabPosition() == 6){
                    logCollection.showToastLong("7");
                }else if (tabLayout.getSelectedTabPosition() == 7){
                    logCollection.showToastLong("8");
                }else if (tabLayout.getSelectedTabPosition() == 8){
                    logCollection.showToastLong("9");
                }else if (tabLayout.getSelectedTabPosition() == 9){
                    logCollection.showToastLong("10");
                }
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
