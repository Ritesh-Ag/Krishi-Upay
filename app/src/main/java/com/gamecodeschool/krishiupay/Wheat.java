package com.gamecodeschool.krishiupay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Wheat extends AppCompatActivity {

    TextView tvWheat;
    Button btnWh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wheat);


        tvWheat=findViewById(R.id.tvWheat);
        btnWh=findViewById(R.id.btnWh);
        tvWheat.setVisibility(View.GONE);


        btnWh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvWheat.setMovementMethod(new ScrollingMovementMethod());
                tvWheat.setVisibility(View.VISIBLE);
            }
        });

    }
}
