package com.gamecodeschool.krishiupay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Mustard extends AppCompatActivity {

    TextView txtv;
    Button btnn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mustard);

        txtv=findViewById(R.id.txtv);
        btnn=findViewById(R.id.btnn);
        txtv.setVisibility(View.GONE);

        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtv.setVisibility(View.VISIBLE);
                txtv.setMovementMethod(new ScrollingMovementMethod());
            }
        });
    }
}
