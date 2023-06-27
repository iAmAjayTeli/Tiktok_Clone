package com.example.tiktokclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.tiktokclone.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
ArrayList<Model> arrayList=new ArrayList<>();
Adapter adapter;
ViewPager2 viewPager2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        viewPager2=findViewById(R.id.vpg2);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        arrayList.add(new Model( "android.resource://" + getPackageName() + "/" + R.raw.video3,R.drawable.image,"Ajay Gupta"));
        arrayList.add(new Model( "android.resource://" + getPackageName() + "/" + R.raw.video1,R.drawable.man,"Takebahadur"));
        arrayList.add(new Model( "android.resource://" + getPackageName() + "/" + R.raw.video2,R.drawable.diya,"Diya Kumari"));
        arrayList.add(new Model( "android.resource://" + getPackageName() + "/" + R.raw.video4,R.drawable.aslam,"Aslam Darji"));
        arrayList.add(new Model( "android.resource://" + getPackageName() + "/" + R.raw.video5,R.drawable.man,"Adarsh Singh"));
        adapter =new Adapter(MainActivity.this,arrayList);
        binding.vpg2.setAdapter(adapter);


    }
}