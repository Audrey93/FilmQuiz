package com.example.aminapc.filmquiz;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RezultatKviza extends AppCompatActivity {
    private Button mRezultat;



    public void init0(){
        mRezultat=(Button) findViewById(R.id.rezultat_povratak);
        mRezultat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent toy= new Intent(RezultatKviza.this,FilmActivity.class);
                RezultatKviza.this.finish();
                startActivity(toy);
            }
        });
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rezultat_kviza);
        init0();


        Typeface myTypeFace = Typeface.createFromAsset(getAssets(),"Lobster_1.3.otf");
        TextView myTextView = (TextView) findViewById(R.id.rezultat_naslov);
        myTextView.setTypeface(myTypeFace);

        myTypeFace = Typeface.createFromAsset(getAssets(),"Lobster_1.3.otf");
        TextView myTextView1 = (TextView) findViewById(R.id.rezultat_score);
        myTextView1.setTypeface(myTypeFace);

        myTypeFace = Typeface.createFromAsset(getAssets(),"Lobster_1.3.otf");
        TextView myTextView2 = (TextView) findViewById(R.id.rezultat_pitanja);
        myTextView2.setTypeface(myTypeFace);

        myTypeFace = Typeface.createFromAsset(getAssets(),"SEASRN__.ttf");
        Button myButton = (Button) findViewById(R.id.rezultat_povratak);
        myButton.setTypeface(myTypeFace);

        TextView mScore=(TextView) findViewById(R.id.rezultat_score);


        Intent toy=getIntent();
        int score=toy.getIntExtra("score",0);
        mScore.setText( ""+ score);


    }
}
