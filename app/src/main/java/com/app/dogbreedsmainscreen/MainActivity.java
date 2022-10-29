package com.app.dogbreedsmainscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.cardview.widget.CardView;

public class MainActivity extends Activity implements View.OnClickListener {

    private CardView card1 , card2 , card3 , card4, card5 , card6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card1 = (CardView) findViewById(R.id.card1_pug);
        card2 = (CardView) findViewById(R.id.card2_basset_hound);
        card3 = (CardView) findViewById(R.id.card3_border_collie);
        card4 = (CardView) findViewById(R.id.card4_dacschund);
        card5 = (CardView) findViewById(R.id.card5_dalmatian);
        card6 = (CardView) findViewById(R.id.card6_siberian_husky);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.card1_pug:
                i = new Intent (this,PugActivity.class);
                    startActivity(i);
                    break;

            case R.id.card2_basset_hound:
                i = new Intent(this,BassetHoundActivity.class);
                    startActivity(i);
                    break;

            case R.id.card3_border_collie:
                i = new Intent(this,BorderCollieActivity.class);
                startActivity(i);
                break;

            case R.id.card4_dacschund:
                i = new Intent(this,DacschundActivity.class);
                startActivity(i);
                break;

            case R.id.card5_dalmatian:
                i = new Intent(this,DalmatianActivity.class);
                startActivity(i);
                break;

            case R.id.card6_siberian_husky:
                i = new Intent(this,SiberianHuskyActivity.class);
                startActivity(i);
                break;
        }
    }
}
