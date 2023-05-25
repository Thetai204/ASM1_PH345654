package com.example.asm1_ph345654;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class trangchuu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trangchu);

        Button btn =findViewById(R.id.btnexit);
        btn .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(trangchuu.this, dangnhapp.class);
                   startActivity(intent);
            }
        });
        Button btnpban =findViewById(R.id.btn_pban);
        btnpban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(trangchuu.this, qlphongbann.class);
            startActivity(intent);
            }
        });


    }
}