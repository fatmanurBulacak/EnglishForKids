package com.englishforkids.fatmanur.englishforkids;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

public class Shapes extends Activity {

    // Declare Variables
    ViewPager viewPager;
    PagerAdapter adapter;
    String[] rank;
    int[] flag;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from viewpager_main.xml
        setContentView(R.layout.activity_numbers);

        // Generate sample data
        rank = new String[] { "ARROW", "CIRCLE", "CROSS", "DIAMOND", "ELLIPSE", "HEART", "HEXAGON", "PENTAGON", "RECTANGLE", "SQUARE","STAR","TRIANGLE" };



        flag = new int[] { R.drawable.arrow, R.drawable.circle,
                R.drawable.cross, R.drawable.diamond,
                R.drawable.ellipse, R.drawable.heart, R.drawable.hexagon,
                R.drawable.pentagon, R.drawable.rectangle, R.drawable.square,R.drawable.star,R.drawable.triangle};

        // Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapterColor(Shapes.this, rank,flag);
        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);

    }
}