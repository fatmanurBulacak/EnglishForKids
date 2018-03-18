package com.englishforkids.fatmanur.englishforkids;



import android.os.Bundle;
import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

public class Vehicles extends Activity {

    // Declare Variables
    ViewPager viewPager;
    PagerAdapter adapter;
    String[] rank;
    int[] flag;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from viewpager_main.xml
        setContentView(R.layout.activity_vehicles);

        // Generate sample data
        rank = new String[] { "AMBULANCE", "FIRETRUCK", "AIRPLANE", "MOTORCYCLE", "TRAIN", "SHIP", "POLICECAR", "HELICOPTER", "BICYCLE", "BUS","CAR","TRACTOR","TRUCK" };



        flag = new int[] { R.drawable.ambulance, R.drawable.firetruck,
                R.drawable.airplane, R.drawable.motorcycle,
                R.drawable.train, R.drawable.ship, R.drawable.policecar,
                R.drawable.helicopter, R.drawable.bicycle, R.drawable.bus,R.drawable.car,R.drawable.tractor,R.drawable.truck};

        // Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapterColor(Vehicles.this, rank,flag);
        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);

    }
}