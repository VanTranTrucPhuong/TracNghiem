package com.example.bt_tuan4;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class manhinh5 extends AppCompatActivity {
    private Button btnext;
    private Button btprevious;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinh5);
        setControl();
        setEnvent();
    }
    @SuppressLint("WrongViewCast")
    public void setControl(){
        btnext = (Button) findViewById(R.id.buttonnext);
        btprevious = (Button) findViewById(R.id.buttonprevious);
    }
    public void setEnvent() {
        btnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity = new Intent(manhinh5.this, manhinh6.class);
                startActivity(activity);
            }
        });

        btprevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity = new Intent(manhinh5.this, manhinh4.class);
                startActivity(activity);
            }
        });
    }
}
