package com.example.aminapc.filmquiz;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class Kviz extends AppCompatActivity {
    private Pitanja mPitanja = new Pitanja();
    private ImageView mImageView;
    private TextView mPitanjeView;
    private Button mButtonOdgovor1;
    private Button mButtonOdgovor2;
    private Button mButtonOdgovor3;
    private Button mButtonOdgovor4;

    private String mOdgovor;
    private int mBrojPitanja = 0;
    private int mScore=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kviz);


        Typeface myTypeFace = Typeface.createFromAsset(getAssets(),"Lobster_1.3.otf");
        TextView myTextView = (TextView) findViewById(R.id.pitanje);
        myTextView.setTypeface(myTypeFace);

        myTypeFace = Typeface.createFromAsset(getAssets(),"SEASRN__.ttf");
        Button myButton1 = (Button) findViewById(R.id.odgovor1);
        myButton1.setTypeface(myTypeFace);

        myTypeFace = Typeface.createFromAsset(getAssets(),"SEASRN__.ttf");
        Button myButton2 = (Button) findViewById(R.id.odgovor2);
        myButton2.setTypeface(myTypeFace);

        myTypeFace = Typeface.createFromAsset(getAssets(),"SEASRN__.ttf");
        Button myButton3 = (Button) findViewById(R.id.odgovor3);
        myButton3.setTypeface(myTypeFace);

        myTypeFace = Typeface.createFromAsset(getAssets(),"SEASRN__.ttf");
        Button myButton4 = (Button) findViewById(R.id.odgovor4);
        myButton4.setTypeface(myTypeFace);


        mImageView = (ImageView) findViewById(R.id.imageView);
        mPitanjeView = (TextView) findViewById(R.id.pitanje);
        mButtonOdgovor1 = (Button) findViewById(R.id.odgovor1);
        mButtonOdgovor2 = (Button) findViewById(R.id.odgovor2);
        mButtonOdgovor3 = (Button) findViewById(R.id.odgovor3);
        mButtonOdgovor4 = (Button) findViewById(R.id.odgovor4);
        updatePitanje();

        mButtonOdgovor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mButtonOdgovor1.getText() == mOdgovor) {
                    mScore=mScore+1;
                    updatePitanje();
                    Toast.makeText(Kviz.this, "Tačan odgovor!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Kviz.this, "Netačan odgovor!", Toast.LENGTH_SHORT).show();
                    updatePitanje();
                }
            }
        });

        mButtonOdgovor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mButtonOdgovor2.getText() == mOdgovor) {
                    mScore=mScore+1;
                    updatePitanje();
                    Toast.makeText(Kviz.this, "Tačan odgovor!", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(Kviz.this, "Netačan odgovor!", Toast.LENGTH_SHORT).show();
                    updatePitanje();
                }
            }
        });

        mButtonOdgovor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mButtonOdgovor3.getText() == mOdgovor) {
                    mScore=mScore+1;
                    updatePitanje();
                    Toast.makeText(Kviz.this, "Tačan odgovor!", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(Kviz.this, "Netačan odgovor!", Toast.LENGTH_SHORT).show();
                    updatePitanje();
                }
            }
        });

        mButtonOdgovor4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mButtonOdgovor4.getText() == mOdgovor) {
                    mScore=mScore+1;
                    updatePitanje();
                    Toast.makeText(Kviz.this, "Tačan odgovor!", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(Kviz.this, "Netačan odgovor!", Toast.LENGTH_SHORT).show();
                    updatePitanje();
                }
            }
        });

    }


    private void updatePitanje() {
        if (mBrojPitanja < mPitanja.vratiDuzinu()) {
            mImageView.setImageResource(mPitanja.vratiSliku(mBrojPitanja));
            mPitanjeView.setText(mPitanja.vratiPitanje(mBrojPitanja));
            mButtonOdgovor1.setText(mPitanja.vratiOdgovor1(mBrojPitanja));
            mButtonOdgovor2.setText(mPitanja.vratiOdgovor2(mBrojPitanja));
            mButtonOdgovor3.setText(mPitanja.vratiOdgovor3(mBrojPitanja));
            mButtonOdgovor4.setText(mPitanja.vratiOdgovor4(mBrojPitanja));

            mOdgovor = mPitanja.vratiTacanOdgovor(mBrojPitanja);
            mBrojPitanja++;

        } else {
            Toast.makeText(Kviz.this, "Ovo je bilo posljednje pitanje!", Toast.LENGTH_SHORT).show();
            Intent toy = new Intent(Kviz.this, RezultatKviza.class);
            toy.putExtra("score", mScore);
            Kviz.this.finish();
            startActivity(toy);
        }
    }
}


