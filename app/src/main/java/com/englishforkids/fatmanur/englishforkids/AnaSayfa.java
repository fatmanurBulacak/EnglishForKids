package com.englishforkids.fatmanur.englishforkids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class AnaSayfa extends AppCompatActivity  {

    public ImageButton imgBtnColor;


    public void Colors() {
        imgBtnColor = (ImageButton) findViewById(R.id.imgBtnColor);
        imgBtnColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(AnaSayfa.this, Colors.class);

                startActivity(toy);
            }
        });
    }


    public ImageButton imgBtnNumber;


    public void Numbers() {
        imgBtnNumber = (ImageButton) findViewById(R.id.imgBtnNumbers);
        imgBtnNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(getApplicationContext(), "NUMBERS", Toast.LENGTH_SHORT).show();
                Intent toy = new Intent(AnaSayfa.this, Numbers.class);

                startActivity(toy);
            }
        });
    }


    public ImageButton imgBtnShapes;


    public void Shapes() {
        imgBtnShapes = (ImageButton) findViewById(R.id.imgBtnShapes);
        imgBtnShapes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(AnaSayfa.this, Shapes.class);

                startActivity(toy);
            }
        });
    }

    public ImageButton imgBtnVehicles;


    public void Vehicles() {
        imgBtnVehicles = (ImageButton) findViewById(R.id.imgBtnVehicles);
        imgBtnVehicles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(AnaSayfa.this, Vehicles.class);

                startActivity(toy);
            }
        });
    }


    public ImageButton imgVegetables;


    public void Vegetable() {
        imgVegetables = (ImageButton) findViewById(R.id.imgBtnVegetables);
        imgVegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(AnaSayfa.this, Vegetables.class);
                startActivity(toy);
            }
        });
    }

    public ImageButton imgBtnPets;


    public void Pets() {
        imgBtnPets = (ImageButton) findViewById(R.id.imgBtnPets);
        imgBtnPets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(AnaSayfa.this, Pets.class);

                startActivity(toy);

            }
        });
    }

    public ImageButton imgBtnFruits;

    public void Fruits() {
        imgBtnFruits = (ImageButton) findViewById(R.id.imgBtnFruits);
        imgBtnFruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(AnaSayfa.this, Fruits.class);

                startActivity(toy);

            }
        });
    }


    public ImageButton imgBtnSongs;

    public void Songs() {
        imgBtnSongs = (ImageButton) findViewById(R.id.imgBtnVideos);
        imgBtnSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(AnaSayfa.this, Songs.class);

                startActivity(toy);

            }
        });
    }

    public ImageButton imgBtnTrueFalseGame;

    public void TrueFalseGame() {
        imgBtnTrueFalseGame = (ImageButton) findViewById(R.id.imgBtnTrueFalseGame);
        imgBtnTrueFalseGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(AnaSayfa.this, TrueFalseGame.class);

                startActivity(toy);

            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana_sayfa);



        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        Colors();
        Numbers();
        Shapes();
        Vehicles();
        Pets();
        Vegetable();
        Fruits();
        Songs();
        TrueFalseGame();

    }
}
