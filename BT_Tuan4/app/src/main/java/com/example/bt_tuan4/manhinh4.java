package com.example.bt_tuan4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class manhinh4 extends AppCompatActivity {
    public Button but1;
    public Button but2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinh4);

        but1=(Button)findViewById(R.id.but4_1);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(manhinh4.this,manhinh3.class);
                startActivity(intent);
            }
        });
        but2=(Button)findViewById(R.id.but4_2);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(manhinh4.this,manhinh5.class);
                startActivity(intent);
            }
        });
    }
}

