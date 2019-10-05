package com.gamecodeschool.krishiupay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ferti extends AppCompatActivity {
    TextView tvFerti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ferti);
        tvFerti=findViewById(R.id.tvFerti);
        tvFerti.setMovementMethod(new ScrollingMovementMethod());

    }
}
