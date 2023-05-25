package com.example.asm1_ph345654;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class wecom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        Thread thread =new Thread(){
            @Override
            public void run(){
                try {
                    sleep(3000);
                    startActivity( new Intent(wecom.this,dangnhapp.class));
                }catch (Exception e){

                }
            }

        }; thread.start();

    }
}