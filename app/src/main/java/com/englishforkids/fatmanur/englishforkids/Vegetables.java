package com.englishforkids.fatmanur.englishforkids;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

public class Vegetables extends Activity {

    // Declare Variables
    ViewPager viewPager;
    PagerAdapter adapter;
    String[] rank;
    int[] flag;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from viewpager_main.xml
        setContentView(R.layout.activity_vegetables);

        // Generate sample data
        rank = new String[] { "BEANS", "PARSLEY", "CABBAGE", "CARROT", "TOMATO", "POTATO", "ONION", "LEEK", "MUSHROOMS", "EGGPLANT","GARLIC","CUCUMBER","PEPPER","CORN" };


        flag = new int[] { R.drawable.beans1, R.drawable.parsley1,
                R.drawable.cabbage1, R.drawable.carrot1,
                R.drawable.tomato1, R.drawable.patato1, R.drawable.onion1,
                R.drawable.leek1, R.drawable.mushrooms1, R.drawable.eggplant1,R.drawable.garlic1,R.drawable.cucumber1,R.drawable.pepper1,R.drawable.corn1};

        // Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapterColor(Vegetables.this, rank,flag);
        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);

    }
}