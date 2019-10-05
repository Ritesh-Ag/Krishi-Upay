package com.gamecodeschool.krishiupay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MaizeText extends AppCompatActivity {

    TextView tvMaize;
    Button btnMa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maize_text);

        tvMaize=findViewById(R.id.tvMaize);
        btnMa=findViewById(R.id.btnMa);
        tvMaize.setVisibility(View.GONE);

        btnMa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvMaize.setMovementMethod(new ScrollingMovementMethod());
                tvMaize.setVisibility(View.VISIBLE);
            }
        });
    }
}
