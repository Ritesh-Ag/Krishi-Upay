package com.gamecodeschool.krishiupay;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Shop extends AppCompatActivity {
    Button btnWeb1,btnWeb2,btnWeb3,btnWeb4,btnWeb5,btnWeb6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        btnWeb1=findViewById(R.id.btnWeb1);
        btnWeb2=findViewById(R.id.btnWeb2);
        btnWeb3=findViewById(R.id.btnWeb3);
        btnWeb4=findViewById(R.id.btnWeb4);
        btnWeb5=findViewById(R.id.btnWeb5);
        btnWeb6=findViewById(R.id.btnWeb6);
        btnWeb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://agribegri.com/"));
                startActivity(intent);
            }
        });
        btnWeb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.amazon.in/s?k=farming+equipment+for+agriculture&crid=3UOOQI2PZJ2W9&sprefix=farming+equip%2Caps%2C763&ref=nb_sb_ss_i_2_13"));
                startActivity(intent);
            }
        });
        btnWeb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.bighaat.com/"));
                startActivity(intent);
            }
        });
        btnWeb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.flipkart.com/search?q=agriculture%20equipments&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=off&as=off"));
                startActivity(intent);
            }
        });
        btnWeb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://agribegri.com/buy-cheap-agricultural-seeds-online-in-india.php"));
                startActivity(intent);
            }

        });
        btnWeb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://agribegri.com/buy-cheap-agricultural-seeds-online-in-india.php"));
                startActivity(intent);
            }
        });

    }
}
