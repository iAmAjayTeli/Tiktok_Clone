package com.example.tiktokclone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class splash extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        imageView=findViewById(R.id.tiktok);
        textView=findViewById(R.id.txt);

        Thread thread=new Thread(){
            @Override
            public void run() {
                try {
                 sleep(3000);
                }
                catch (Exception e){
                   getAllStackTraces();
                }
                finally {
                   Intent intent=new Intent(splash.this,MainActivity.class);
                   startActivity(intent);
                   finish();
                }
            }
        }; thread.start();
    }
}