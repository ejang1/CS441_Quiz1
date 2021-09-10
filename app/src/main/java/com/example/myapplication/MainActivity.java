package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import java.util.Random;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    AnimalSet as = new AnimalSet();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //new DownloadImageFromInternet((ImageView) findViewById(R.id.imageView)).execute("https://pbs.twimg.com/profile_images/630285593268752384/iD1MkFQ0.png");
        new DownloadImageTask((ImageView)findViewById(R.id.imageView)).execute("https://static.vecteezy.com/system/resources/thumbnails/002/163/795/small/simple-set-of-animal-related-line-icons-free-vector.jpg");
    }

    public void animalChange(View view){
        Random random = new Random();
        int randNum = random.nextInt(5);
        Object animalName = as.animalSet.keySet().toArray()[randNum];
        TextView animalNameTag = (TextView)findViewById(R.id.animalName);
        animalNameTag.setText((String)animalName);
        new DownloadImageTask((ImageView)findViewById(R.id.imageView)).execute(as.animalSet.get((String)animalName));

    }
}