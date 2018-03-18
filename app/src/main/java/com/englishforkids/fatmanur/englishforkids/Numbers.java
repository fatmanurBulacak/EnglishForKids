package com.englishforkids.fatmanur.englishforkids;



        import android.os.Bundle;
                import android.app.Activity;
                import android.support.v4.view.PagerAdapter;
                import android.support.v4.view.ViewPager;

public class Numbers extends Activity {

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
        rank = new String[] {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};



        flag = new int[] { R.drawable.zero, R.drawable.one,
                R.drawable.two, R.drawable.three,
                R.drawable.four, R.drawable.five, R.drawable.six,
                R.drawable.seven, R.drawable.eight, R.drawable.nine};

        // Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapterColor(Numbers.this, rank,flag);
        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);

    }
}