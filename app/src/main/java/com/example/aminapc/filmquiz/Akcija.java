package com.example.aminapc.filmquiz;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Akcija extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akcija);


        Typeface myTypeFace = Typeface.createFromAsset(getAssets(),"Lobster_1.3.otf");
        TextView myTextView = (TextView) findViewById(R.id.terminator_naslov);
        myTextView.setTypeface(myTypeFace);


        myTypeFace = Typeface.createFromAsset(getAssets(),"Lobster_1.3.otf");
        TextView myTextView1 = (TextView) findViewById(R.id.diehard_naslov);
        myTextView1.setTypeface(myTypeFace);


        myTypeFace = Typeface.createFromAsset(getAssets(),"Lobster_1.3.otf");
        TextView myTextView2 = (TextView) findViewById(R.id.truelies_naslov);
        myTextView2.setTypeface(myTypeFace);
    }
}
