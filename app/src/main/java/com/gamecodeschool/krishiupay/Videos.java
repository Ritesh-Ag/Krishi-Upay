package com.gamecodeschool.krishiupay;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Videos extends AppCompatActivity {

    ImageView wheat,paddy,machine,organic,kisan,mausam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);

        wheat=findViewById(R.id.wheat);
        paddy=findViewById(R.id.paddy);
        machine=findViewById(R.id.machine);
        organic=findViewById(R.id.organic);
        kisan=findViewById(R.id.kisan);
        mausam=findViewById(R.id.mausam);

        wheat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLRCuES4BI4h74zzjJr4ZqSKdFLHGOABg2"));
                startActivity(intent);
            }
        });

        paddy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLRCuES4BI4h4vPO5ALz911UhigROTLsbH"));
                startActivity(intent);
            }

        });

        machine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLRCuES4BI4h4PW2ubv_Vwak-6WqtCLHbK"));
                startActivity(intent);
            }
        });

        organic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLRCuES4BI4h4tM0teM_P9p3JYFKPDcLBS"));
                startActivity(intent);
            }
        });

        kisan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLKANlcNm49aXZ8WcZUJ28wLwpXb8RH4eD"));
                startActivity(intent);
            }
        });

        mausam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLKANlcNm49aV9Jzd79FnoxfwxGDdhTWnC"));
                startActivity(intent);
            }
        });
    }
}
