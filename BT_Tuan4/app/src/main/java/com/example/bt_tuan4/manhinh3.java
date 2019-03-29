package com.example.bt_tuan4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class manhinh3 extends AppCompatActivity {
    public Button but1;
    public Button but2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinh3);
        but1=(Button)findViewById(R.id.but3_1);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(manhinh3.this,manhinh2.class);
                startActivity(intent);
            }
        });
        but2=(Button)findViewById(R.id.but3_2);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(manhinh3.this,manhinh4.class);
                startActivity(intent);
            }
        });
    }
}


