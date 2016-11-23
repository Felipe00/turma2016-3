package br.com.interaje.turma2016_3.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import br.com.interaje.turma2016_3.R;
import br.com.interaje.turma2016_3.adapters.ViewPagerAdapter;
import br.com.interaje.turma2016_3.utils.SlidingTabLayout;

public class SlidingExampleActivity extends AppCompatActivity {
    // Declaring Your View and Variables

    Toolbar toolbar;
    ViewPager pager;
    ViewPagerAdapter adapter;
    SlidingTabLayout slidingTabLayout;
    CharSequence Titles[] = {"Ajuda", "Sobre o App"};
    int Numboftabs = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sliding_example);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Creating The Toolbar and setting it as the Toolbar for the activity

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);


        // Creating The ViewPagerAdapter and Passing Fragment Manager, Titles fot the Tabs and Number Of Tabs.
        adapter = new ViewPagerAdapter(getSupportFragmentManager(), Titles, Numboftabs);

        // Assigning ViewPager View and setting the adapter
        pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(adapter);

        // Assiging the Sliding Tab Layout View
        slidingTabLayout = (SlidingTabLayout) findViewById(R.id.tabs);
        // To make the Tabs Fixed set this true, This makes the tabs Space Evenly in Available width
        slidingTabLayout.setDistributeEvenly(true);

        // Setting Custom Color for the Scroll bar indicator of the Tab View
        slidingTabLayout.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.tabsScrollColor);
            }
        });

        // Setting the ViewPager For the SlidingTabsLayout
        slidingTabLayout.setViewPager(pager);
    }

}
