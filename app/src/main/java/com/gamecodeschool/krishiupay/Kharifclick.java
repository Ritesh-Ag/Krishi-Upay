package com.gamecodeschool.krishiupay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Kharifclick extends AppCompatActivity {

    ImageButton btnRice, btnCane, btnMaize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kharifclick);

        btnRice=findViewById(R.id.btnRice);
        btnCane=findViewById(R.id.btnSu);
        btnMaize=findViewById(R.id.btnMaize);


        btnRice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Kharifclick.this,RiceText.class);
                startActivity(intent);

            }
        });

        btnCane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Kharifclick.this,SugarcaneText.class);
                startActivity(intent);


            }
        });
        btnMaize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Kharifclick.this,MaizeText.class);
                startActivity(intent);

            }
        });
    }
}
