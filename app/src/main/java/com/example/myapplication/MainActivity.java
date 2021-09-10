package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //new DownloadImageFromInternet((ImageView) findViewById(R.id.imageView)).execute("https://pbs.twimg.com/profile_images/630285593268752384/iD1MkFQ0.png");

    }

    private void animalChange(View view){
        TextView animalNameTag = (TextView)findViewById(R.id.animalName);
        Button animalButton = (Button)findViewById(R.id.animalButton);
        new DownloadImageTask((ImageView) findViewById(R.id.imageView)).execute("");
    }
}