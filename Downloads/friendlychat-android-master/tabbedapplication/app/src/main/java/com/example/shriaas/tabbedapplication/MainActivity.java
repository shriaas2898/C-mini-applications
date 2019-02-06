package com.example.shriaas.tabbedapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {
    TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabHost = (TabHost)findViewById(R.id.tabhost);
        tabHost.setup();
        TabHost.TabSpec sp1=tabHost.newTabSpec("Tab1");
        sp1.setIndicator("TAB 1");
        sp1.setContent(R.id.tab1);
        TabHost.TabSpec sp2=tabHost.newTabSpec("Tab2");
        sp2.setIndicator("TAB 2");
        sp2.setContent(R.id.tab2);
        tabHost.addTab(sp1);
        tabHost.addTab(sp2);
        tabHost.setCurrentTab(0);

    }
}
