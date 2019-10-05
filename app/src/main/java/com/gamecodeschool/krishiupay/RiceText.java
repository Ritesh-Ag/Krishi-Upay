package com.gamecodeschool.krishiupay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RiceText extends AppCompatActivity {

    TextView tvRice;
    Button btnRi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rice_text);

        tvRice=findViewById(R.id.tvRice);
        btnRi=findViewById(R.id.btnRi);
        tvRice.setVisibility(View.GONE);

        btnRi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvRice.setMovementMethod(new ScrollingMovementMethod());
                tvRice.setVisibility(View.VISIBLE);
            }
        });

    }
}
