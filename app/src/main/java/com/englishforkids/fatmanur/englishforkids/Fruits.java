package com.englishforkids.fatmanur.englishforkids;



import android.os.Bundle;
import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

public class Fruits extends Activity {

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
        rank = new String[] { "PLUM", "ORANGE", "KIWI", "WATERMELON", "MANDARIN", "APRICOT", "CHERRY", "STRAWBERRY", "PEACH", "GRAPE","MELON","BANANA","PEAR","PINEAPPLE","LEMON","FIG" };

        flag = new int[] { R.drawable.plum1, R.drawable.orange1,
                R.drawable.kiwi1, R.drawable.watermelon1,
                R.drawable.mandarin1, R.drawable.apricot1, R.drawable.cherry1,
                R.drawable.strawberry1, R.drawable.peach1, R.drawable.grape1,R.drawable.melon1,R.drawable.banana1,R.drawable.pear1,R.drawable.pinepple1,R.drawable.lemon1,R.drawable.fig1};

        // Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapterColor(Fruits.this, rank,flag);
        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);

    }
}