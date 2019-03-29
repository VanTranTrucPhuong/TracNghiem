package com.example.bt_tuan4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class manhinh2 extends AppCompatActivity {
    TextView txtCauHoi;
    RadioGroup radioGroup_1;
    RadioButton rb_mh2_1_a, rb_mh2_1_b, rb_mh2_1_c, rb_mh2_1_d;
    Button btnPre, btnResult, btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinh2);
        setControl();
        setEnvent();
    }
    private void setControl(){
        txtCauHoi = findViewById(R.id.txtCauHoi);
        radioGroup_1 = findViewById(R.id.radioGroup_1);
        rb_mh2_1_a = findViewById(R.id.rb_mh2_1_a);
        rb_mh2_1_b = findViewById(R.id.rb_mh2_1_b);
        rb_mh2_1_c = findViewById(R.id.rb_mh2_1_c);
        rb_mh2_1_d = findViewById(R.id.rb_mh2_1_d);
        btnPre = findViewById(R.id.btnPre);
        btnResult = findViewById(R.id.btnResult);
        btnNext = findViewById(R.id.btnNext);
    }
    public void setEnvent() {
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity = new Intent(manhinh2.this, manhinh3.class);
                startActivity(activity);
            }
        });
        btnPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity = new Intent(manhinh2.this, MainActivity.class);
                startActivity(activity);
            }
        });
    }
}

//        import com.example.vantrantrucphuong.tracnghiem.R;

