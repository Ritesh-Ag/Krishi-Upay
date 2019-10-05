package com.gamecodeschool.krishiupay;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class govtscheme extends AppCompatActivity {

    Button btnpm,btnfw,btnrkvy,btnsh,btnpmf,btnpmk,btna,btnagm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_govtscheme);

        btnpm=findViewById(R.id.btnpm);
        btnfw=findViewById(R.id.btnfw);
        btnrkvy=findViewById(R.id.btnrkvy);
        btnsh=findViewById(R.id.btnsh);
        btnpmf=findViewById(R.id.btnpmf);
        btnpmk=findViewById(R.id.btnpmk);
        btna=findViewById(R.id.btna);
        btnagm=findViewById(R.id.btnagm);
        btnpm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://dcmsme.gov.in/schemes/pmry.html"));
                startActivity(intent);
            }
        });
        btnfw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://agricoop.gov.in/divisiontype/rainfed-farming-system/programmes-schemes-new-initiatives"));
                startActivity(intent);
            }
        });
        btnrkvy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://rkvy.nic.in/"));
                startActivity(intent);
            }
        });
        btnsh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://archive.india.gov.in/citizen/agriculture/viewscheme.php?schemeid=812"));
                startActivity(intent);
            }
        });
        btnpmf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://pmfby.gov.in/"));
                startActivity(intent);
            }
        });
        btnpmk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(" https://pmksy.gov.in/"));
                startActivity(intent);
            }
        });
        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://agripb.gov.in/home.php?page=aatma"));
                startActivity(intent);
            }
        });
        btnagm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.agmarknet.nic.in"));
                startActivity(intent);
            }
        });
    }
}
