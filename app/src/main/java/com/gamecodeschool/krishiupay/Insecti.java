package com.gamecodeschool.krishiupay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Insecti extends AppCompatActivity {

    TextView tvInsecti;
    TextView tvIT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insecti);

        tvIT=findViewById(R.id.tvIT);
        tvIT.setMovementMethod(new ScrollingMovementMethod());

    }
}
