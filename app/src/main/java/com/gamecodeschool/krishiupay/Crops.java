package com.gamecodeschool.krishiupay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Crops extends AppCompatActivity {

    ImageButton ibkharif;
    ImageButton ibRabi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crops);

        ibkharif = findViewById(R.id.ibkharif);
        ibRabi = findViewById(R.id.ibRabi);

        ibkharif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Crops.this, Kharifclick.class);
                startActivity(intent);


            }
        });

        ibRabi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Crops.this, Rabiclick.class);
                startActivity(intent);

            }
        });
    }
}
