package com.example.aminapc.filmquiz;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Drama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drama);

        Typeface myTypeFace = Typeface.createFromAsset(getAssets(),"Lobster_1.3.otf");
        TextView myTextView = (TextView) findViewById(R.id.godfather_naslov);
        myTextView.setTypeface(myTypeFace);

        myTypeFace = Typeface.createFromAsset(getAssets(),"Lobster_1.3.otf");
        TextView myTextView1 = (TextView) findViewById(R.id.heat_naslov);
        myTextView1.setTypeface(myTypeFace);

        myTypeFace = Typeface.createFromAsset(getAssets(),"Lobster_1.3.otf");
        TextView myTextView2 = (TextView) findViewById(R.id.darkknight_naslov);
        myTextView2.setTypeface(myTypeFace);
    }
}
