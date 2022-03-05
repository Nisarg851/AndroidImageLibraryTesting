package com.example.coilwithjava;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import coil.Coil;
import coil.ImageLoader;
import coil.ImageLoaders;
import coil.request.ImageRequest;

public class MainActivity extends AppCompatActivity {

    private String imageURL = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.mmJWG7BsR2qqWMOc-jSezAHaEo%26pid%3DApi&f=1";

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.ivImage);

        ImageLoader imageLoader = Coil.imageLoader(getApplicationContext());

        ImageRequest imageRequest = new ImageRequest.Builder(getApplicationContext())
                .data(imageURL)
                .crossfade(true)
                .crossfade(700)
                .target(imageView)
                .build();

        // to load Image Asyncronously
        // to Load Image Directly into Image View
         imageLoader.enqueue(imageRequest);

        // to Loading Image Syncronously
        // Log.e("imageLoadTime", "onCreate: Image Loading start");
        // Drawable image = ImageLoaders.executeBlocking(imageLoader, imageRequest).getDrawable();
        // imageView.setImageDrawable(image);
        // Log.e("imageLoadTime", "onCreate: Image Loaded");
    }
}