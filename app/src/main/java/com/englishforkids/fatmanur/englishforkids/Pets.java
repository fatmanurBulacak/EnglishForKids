package com.englishforkids.fatmanur.englishforkids;



import android.os.Bundle;
import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

public class Pets extends Activity {

    // Declare Variables
    ViewPager viewPager;
    PagerAdapter adapter;
    String[] rank;
    int[] flag;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from viewpager_main.xml
        setContentView(R.layout.activity_pets);

        // Generate sample data
        rank = new String[] {"DOG","CAT","FISH", "TURTLE", "SNAKE", "ELEPHANT", "CAMEL", "BIRD", "CHICKEN", "COW", "LAMB","RABBIT","HORSE","BEE","SNAIL","PIG"};



        flag = new int[] { R.drawable.dog, R.drawable.cat,
                R.drawable.fish, R.drawable.turtle,
                R.drawable.snake, R.drawable.elephant, R.drawable.camel,
                R.drawable.bird, R.drawable.chicken, R.drawable.cow,
                R.drawable.lamb,R.drawable.rabbit,R.drawable.horse,R.drawable.bee,R.drawable.snail,R.drawable.pig};

        // Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapterColor(Pets.this, rank,flag);
        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);

    }
}