package com.example.asm1_ph345654;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class qlphongbann extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qlphongban);

        Button btn =findViewById(R.id.btn_back);
        btn .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(qlphongbann.this, dangnhapp.class);
                   startActivity(intent);
            }
        });


    }
}