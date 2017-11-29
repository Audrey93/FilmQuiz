package com.example.aminapc.filmquiz;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;

public class Zanrovi extends AppCompatActivity {
    ViewPager mViewPager;
    public Button mAkcija;
    public Button mAnimirani;
    public Button mDrama;
    public Button mKomedija;
    public Button mRomanticni;



    public void init0(){
        mAkcija=(Button) findViewById(R.id.akcija);
        mAkcija.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent toy= new Intent(Zanrovi.this,Akcija.class);
                startActivity(toy);
            }
        });
    }

    public void init1 (){
        mAnimirani=(Button) findViewById(R.id.animirani);
        mAnimirani.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent toy= new Intent(Zanrovi.this,Animirani.class);
                startActivity(toy);
            }
        });
    }

    public void init2 (){
        mDrama=(Button) findViewById(R.id.drama);
        mDrama.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent toy= new Intent(Zanrovi.this,Drama.class);
                startActivity(toy);
            }
        });
    }
    public void init3 (){
        mKomedija=(Button) findViewById(R.id.komedija);
        mKomedija.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent toy= new Intent(Zanrovi.this,Komedija.class);
                startActivity(toy);
            }
        });
    }
    public void init4 (){
        mRomanticni=(Button) findViewById(R.id.romanticni);
        mRomanticni.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent toy= new Intent(Zanrovi.this,Romanticni.class);
                startActivity(toy);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zanrovi);
        mViewPager = (ViewPager) findViewById(R.id.viewPager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);
        mViewPager.setAdapter(viewPagerAdapter);


        Timer timer = new Timer();
        timer.schedule(new myTimerTask(), 1000, 3000);



        Typeface myTypeFace = Typeface.createFromAsset(getAssets(),"SEASRN__.ttf");
        Button myButton1 = (Button) findViewById(R.id.akcija);
        myButton1.setTypeface(myTypeFace);

        myTypeFace = Typeface.createFromAsset(getAssets(),"SEASRN__.ttf");
        Button myButton2 = (Button) findViewById(R.id.animirani);
        myButton2.setTypeface(myTypeFace);

         myTypeFace = Typeface.createFromAsset(getAssets(),"SEASRN__.ttf");
        Button myButton3 = (Button) findViewById(R.id.drama);
        myButton3.setTypeface(myTypeFace);

        myTypeFace = Typeface.createFromAsset(getAssets(),"SEASRN__.ttf");
        Button myButton4 = (Button) findViewById(R.id.komedija);
        myButton4.setTypeface(myTypeFace);

        myTypeFace = Typeface.createFromAsset(getAssets(),"SEASRN__.ttf");
        Button myButton5 = (Button) findViewById(R.id.romanticni);
        myButton5.setTypeface(myTypeFace);
        init0();
        init1();
        init2();
        init3();
        init4();
    }

    public class myTimerTask extends TimerTask {


        @Override
        public void run() {

            Zanrovi.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if (mViewPager.getCurrentItem() == 0) {
                        mViewPager.setCurrentItem(1);
                    } else if (mViewPager.getCurrentItem() == 1) {
                        mViewPager.setCurrentItem(2);
                    } else if (mViewPager.getCurrentItem() == 2) {
                        mViewPager.setCurrentItem(3);
                    } else if (mViewPager.getCurrentItem() == 3) {
                        mViewPager.setCurrentItem(4);
                    }
                    else {
                        mViewPager.setCurrentItem(1);
                    }
                }
            });


        }


    }
}
