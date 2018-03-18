package com.englishforkids.fatmanur.englishforkids;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Locale;

public class ViewPagerAdapterColor extends PagerAdapter implements TextToSpeech.OnInitListener  {
    // Declare Variables
    Context context;
    String[] rank;
    int[] flag;
    LayoutInflater inflater;
    Button btnTextOku;
    private TextToSpeech tts;

    public ViewPagerAdapterColor(Context context, String[] rank, int[] flag) {
        this.context = context;
        this.rank = rank;
        this.flag = flag;
    }

    @Override
    public int getCount() {
        return rank.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((RelativeLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {

        // Declare Variables
        TextView txtrank;
        ImageView imgflag;

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.viewpager_item_color, container, false);


        tts = new TextToSpeech(context, this);
        // Locate the TextViews in viewpager_item.xml
        txtrank = (TextView) itemView.findViewById(R.id.rank);

        // Capture position and set to the TextViews
        txtrank.setText(rank[position]);

        // Locate the ImageView in viewpager_item.xml
        imgflag = (ImageView) itemView.findViewById(R.id.flag);
        // Capture position and set to the ImageView
        imgflag.setImageResource(flag[position]);
        btnTextOku = (Button) itemView.findViewById(R.id.btnTextOku);

        btnTextOku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speakOut(position);
            }
        });
        // Add viewpager_item.xml to ViewPager
        ((ViewPager) container).addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        // Remove viewpager_item.xml from ViewPager
        ((ViewPager) container).removeView((RelativeLayout) object);

    }

    @Override
    public void onInit(int status) {

        if (status == TextToSpeech.SUCCESS) {

            int result = tts.setLanguage(Locale.US);

            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                Log.e("TTS", "This Language is not supported");
            } else {
                btnTextOku.setEnabled(true);
               //speakOut();
            }

        } else {
            Log.e("TTS", "Initilization Failed!");
        }

    }

    private void speakOut(int ps) {

        String text = rank[ps].toString();
        String a = rank.toString();
        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
    }
}