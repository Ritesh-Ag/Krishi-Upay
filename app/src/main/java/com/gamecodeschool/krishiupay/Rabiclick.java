package com.gamecodeschool.krishiupay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Rabiclick extends AppCompatActivity {

    ImageButton btnWheat,btnOats,btnMustard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rabiclick);


        btnWheat=findViewById(R.id.btnWheat);
        btnOats=findViewById(R.id.btnOats);
        btnMustard=findViewById(R.id.btnMustard);

        btnWheat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Rabiclick.this,Wheat.class);
                startActivity(intent);


            }
        });
        btnOats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Rabiclick.this,Oats.class);
                startActivity(intent);

            }
        });
        btnMustard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Rabiclick.this,Mustard.class);
                startActivity(intent);

            }
        });
    }
}
