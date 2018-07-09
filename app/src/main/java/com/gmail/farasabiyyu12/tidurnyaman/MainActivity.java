package com.gmail.farasabiyyu12.tidurnyaman;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    //TODO Declaring Widget
    Toolbar mtoolbar;
    ViewPager mViewPager;
    TabLayout mTabLayout;
    TabPageAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO Set Toolbar
        mtoolbar = findViewById(R.id.main_toolbar);
        setSupportActionBar(mtoolbar);
//        getSupportActionBar().setSubtitle("Subtitle nye");

        //TODO Setting View Pager
        mViewPager = findViewById(R.id.main_viewpager);

        //TODO Set Adapter
        mAdapter = new TabPageAdapter(getSupportFragmentManager());

        //TODO Setting ViewPager
        mViewPager.setAdapter(mAdapter);

        //TODO Setting TabLayout
        mTabLayout = findViewById(R.id.main_tab_layout);
        mTabLayout.setupWithViewPager(mViewPager);

    }
}
