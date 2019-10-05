package com.gamecodeschool.krishiupay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Fertilizers extends AppCompatActivity {
    Spinner spinner3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fertilizers);
        spinner3=findViewById(R.id.spinner3);
        List<String>categories=new ArrayList<>();
        categories.add(0,"Select your category");
        categories.add(1,"Fertilizers");
        categories.add(2,"Insecticides");


        ArrayAdapter<String> arrayAdapter;
        arrayAdapter= new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,categories);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(parent.getItemAtPosition(position).equals("select your category"))
                {
                    //do nothing
                }
                else {
                    if (parent.getItemAtPosition(position).equals("Fertilizers")) {
                        Intent intent = new Intent(Fertilizers.this, Ferti.class);
                        startActivity(intent);
                    }
                    else {
                        if (parent.getItemAtPosition(position).equals("Insecticides")) {
                            Intent intent = new Intent(Fertilizers.this, Insecti.class);
                            startActivity(intent);
                        }
                        else{
                            if(parent.getItemAtPosition(position).equals("उर्वरक")){
                                Intent intent = new Intent(Fertilizers.this, Ferti.class);
                                startActivity(intent);
                            }
                            else{
                                if(parent.getItemAtPosition(position).equals("ਖਾਦ")){
                                    Intent intent = new Intent(Fertilizers.this, Ferti.class);
                                    startActivity(intent);
                                }
                                else{
                                    if(parent.getItemAtPosition(position).equals("कीटनाशक")){
                                        Intent intent = new Intent(Fertilizers.this, Insecti.class);
                                        startActivity(intent);
                                    }
                                    else{
                                        if(parent.getItemAtPosition(position).equals("ਕੀਟਨਾਸ਼ਕ")){
                                            Intent intent = new Intent(Fertilizers.this, Insecti.class);
                                            startActivity(intent);
                                        }
                                    }
                                }
                            }
                        }

                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //TODO Auto-generated method stub
            }
        });

    }
}
