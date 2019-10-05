package com.gamecodeschool.krishiupay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Oats extends AppCompatActivity {

    TextView tvOats;
    Button btnOa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oats);

        tvOats=findViewById(R.id.tvOats);
        btnOa=findViewById(R.id.btnOa);
        tvOats.setVisibility(View.GONE);

        btnOa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvOats.setMovementMethod(new ScrollingMovementMethod());
                tvOats.setVisibility(View.VISIBLE);
            }
        });
    }
}
