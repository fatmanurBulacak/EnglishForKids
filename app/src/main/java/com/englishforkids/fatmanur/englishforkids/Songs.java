package com.englishforkids.fatmanur.englishforkids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Songs extends AppCompatActivity {

    public ImageButton imgBtnColorsSong;

    public void ColorsSong() {
        imgBtnColorsSong = (ImageButton) findViewById(R.id.imgBtnColorSong);
        imgBtnColorsSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "SONGS", Toast.LENGTH_LONG).show();
                Intent toy = new Intent(Songs.this, ColorsSong.class);

                startActivity(toy);

            }
        });
    }

    public ImageButton imgBtnVehiclesSong;

    public void VehiclesSong() {
        imgBtnVehiclesSong = (ImageButton) findViewById(R.id.imgBtnVehiclesSong);
        imgBtnVehiclesSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "SONGS", Toast.LENGTH_LONG).show();
                Intent toy = new Intent(Songs.this, VehiclesSong.class);

                startActivity(toy);

            }
        });
    }


    public ImageButton imgBtnNumbersSong;

    public void NumbersSong() {
        imgBtnNumbersSong = (ImageButton) findViewById(R.id.imgBtnNumbersSong);
        imgBtnNumbersSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "NUMBERS", Toast.LENGTH_LONG).show();
                Intent toy = new Intent(Songs.this, NumbersSong.class);

                startActivity(toy);

            }
        });
    }

    public ImageButton imgBtnShapesSong;

    public void ShapesSong() {
        imgBtnShapesSong = (ImageButton) findViewById(R.id.imgBtnShapesSong);
        imgBtnShapesSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "SHAPES", Toast.LENGTH_LONG).show();
                Intent toy = new Intent(Songs.this, ShapesSong.class);

                startActivity(toy);

            }
        });
    }

    public ImageButton imgBtnFruitsSong;

    public void FruitsSong() {
        imgBtnFruitsSong = (ImageButton) findViewById(R.id.imgBtnFruitsSong);
        imgBtnFruitsSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "FRUITS", Toast.LENGTH_LONG).show();
                Intent toy = new Intent(Songs.this, FruitsSong.class);

                startActivity(toy);

            }
        });
    }


    public ImageButton imgBtnVegetablesSong;

    public void VegetablesSong() {
        imgBtnVegetablesSong = (ImageButton) findViewById(R.id.imgBtnVegetablesSong);
        imgBtnVegetablesSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "VEGETABLES", Toast.LENGTH_LONG).show();
                Intent toy = new Intent(Songs.this, VegetablesSong.class);

                startActivity(toy);

            }
        });
    }

    public ImageButton imgBtnPetsSong;

    public void PetsSong() {
        imgBtnPetsSong = (ImageButton) findViewById(R.id.imgBtnPetsSong);
        imgBtnPetsSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "PETS", Toast.LENGTH_LONG).show();
                Intent toy = new Intent(Songs.this, PetsSong.class);

                startActivity(toy);

            }
        });
    }

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);




            ColorsSong();
            VehiclesSong();
            NumbersSong();
            ShapesSong();
            FruitsSong();
            VegetablesSong();
            PetsSong();
    }
}
