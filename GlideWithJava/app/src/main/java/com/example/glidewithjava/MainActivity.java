package com.example.glidewithjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class MainActivity extends AppCompatActivity {

    String imageURL = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.XFKfJK6cSKItguEeTbrjngHaEo%26pid%3DApi&f=1";

    ImageView imageView1, imageView2, imageView3, imageView4, imageView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = findViewById(R.id.ivImage1);
        imageView2 = findViewById(R.id.ivImage2);
        imageView3 = findViewById(R.id.ivImage3);
        imageView4 = findViewById(R.id.ivImage4);
        imageView5 = findViewById(R.id.ivImage5);



        // Loading Image from URL
        Glide.with(this)
                .load(imageURL)
                .transition(DrawableTransitionOptions.withCrossFade(700))
                .into(imageView1);


        Glide.with(this)
                .load(imageURL)
                .transition(DrawableTransitionOptions.withCrossFade(700))
                .into(imageView2);


        Glide.with(this)
                .load(imageURL)
                .transition(DrawableTransitionOptions.withCrossFade(700))
                .into(imageView3);


        Glide.with(this)
                .load(imageURL)
                .transition(DrawableTransitionOptions.withCrossFade(700))
                .into(imageView4);


        Glide.with(this)
                .load(imageURL)
                .transition(DrawableTransitionOptions.withCrossFade(700))
                .into(imageView5);
    }
}