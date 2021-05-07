package com.jsstech.ratingbardemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
RatingBar ratebar;
Button rateMe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ratebar=findViewById(R.id.ratingBar2);
        rateMe=findViewById(R.id.rate_me);

        rateMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float rattingvalue=ratebar.getRating();
                Toast.makeText(MainActivity.this,"Rating" +rattingvalue,Toast.LENGTH_SHORT).show();
            }
        });
    }
}