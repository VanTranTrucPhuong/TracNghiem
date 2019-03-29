package com.example.bt_tuan4;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class manhinh6 extends AppCompatActivity {
    private Button btnext;
    private Button btprevious;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinh6);
        setControl();
        setEnvent();
    }
    @SuppressLint("WrongViewCast")
    public void setControl(){
        btnext = (Button) findViewById(R.id.buttonnext);
        btprevious = (Button) findViewById(R.id.buttonprevious);
    }
    public void setEnvent() {
        btprevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity = new Intent(manhinh6.this, manhinh5.class);
                startActivity(activity);
            }
        });
        btnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity = new Intent(manhinh6.this, manhinh7.class);
                startActivity(activity);
            }
        });


    }
}