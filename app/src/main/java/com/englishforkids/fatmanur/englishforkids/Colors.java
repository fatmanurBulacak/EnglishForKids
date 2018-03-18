package com.englishforkids.fatmanur.englishforkids;

import android.os.Bundle;
                import android.app.Activity;
                import android.support.v4.view.PagerAdapter;
                import android.support.v4.view.ViewPager;

public class Colors extends Activity  {

    // Declare Variables
    ViewPager viewPager;
    PagerAdapter adapter;
    String[] rank;
    int[] flag;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from viewpager_main.xml
        setContentView(R.layout.activity_colors);

        // Generate sample data
        rank = new String[] { "PINK", "ORANGE", "RED", "YELLOW", "BLACK", "BLUE", "BROWN", "GREEN", "GREY", "PURPLE","WHITE" };



        flag = new int[] { R.drawable.pink, R.drawable.orange,
                R.drawable.red, R.drawable.yellow,
                R.drawable.black, R.drawable.blue, R.drawable.brown,
                R.drawable.green1, R.drawable.grey, R.drawable.purple,R.drawable.white1};

        // Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapterColor(Colors.this, rank,flag);
        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);

    }
}