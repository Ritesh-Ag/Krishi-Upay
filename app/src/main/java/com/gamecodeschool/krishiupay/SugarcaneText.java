package com.gamecodeschool.krishiupay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SugarcaneText extends AppCompatActivity {

    TextView tvSugarcane;
    Button btnSu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sugarcane_text);

        tvSugarcane=findViewById(R.id.tvSugarcane);
        btnSu=findViewById(R.id.btnSu);
        tvSugarcane.setVisibility(View.GONE);

        btnSu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSugarcane.setMovementMethod(new ScrollingMovementMethod());
                tvSugarcane.setVisibility(View.VISIBLE);
            }
        });
    }
}
