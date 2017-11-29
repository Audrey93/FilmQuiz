package com.example.aminapc.filmquiz;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FilmActivity extends AppCompatActivity {


    public Button mDetaljnije;
    public Button mKviz;


    public void init() {
        mDetaljnije = (Button) findViewById(R.id.detaljnije);
        mDetaljnije.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(FilmActivity.this, Zanrovi.class);
                startActivity(toy);
            }
        });
    }
    public void init1() {
        mKviz = (Button) findViewById(R.id.kviz);
        mKviz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(FilmActivity.this, Kviz.class);
                startActivity(toy);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film);

        Typeface myTypeFace = Typeface.createFromAsset(getAssets(),"Lobster_1.3.otf");
        Button myButton1 = (Button) findViewById(R.id.kviz);
        myButton1.setTypeface(myTypeFace);

        myTypeFace = Typeface.createFromAsset(getAssets(),"Lobster_1.3.otf");
        Button myButton2 = (Button) findViewById(R.id.detaljnije);
        myButton2.setTypeface(myTypeFace);

        myTypeFace = Typeface.createFromAsset(getAssets(),"Lobster_1.3.otf");
        TextView myButton3 = (TextView) findViewById(R.id.textView2);
        myButton3.setTypeface(myTypeFace);

        init();
        init1();


    }
}
