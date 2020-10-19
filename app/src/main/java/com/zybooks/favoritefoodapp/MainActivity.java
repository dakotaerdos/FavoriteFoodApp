package com.zybooks.favoritefoodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button menuButton;
    Button mapButton;
    Button callButton;
    Button favoritesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuButton = findViewById(R.id.MenuButton);
        mapButton = findViewById(R.id.MapButton);
        callButton = findViewById(R.id.CallButton);
        favoritesButton = findViewById(R.id.FavoritesButton);
    }

    public void onMenuButtonClick (View view) {
        Uri webpage = Uri.parse("http://texasroadhouse.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }

    public void onMapButtonClick (View view) {
        Uri map = Uri.parse("geo:0,0?q=Texas+Roadhouse");
        Intent intent = new Intent(Intent.ACTION_VIEW, map);
        startActivity(intent);
    }

    public void onCallButtonClick (View view) {
        Uri dial = Uri.parse("tel:989-775-7427");
        Intent intent = new Intent(Intent.ACTION_DIAL, dial);
        startActivity(intent);
    }

    public void onFavoritesButtonClick (View view) {
        Intent intent = new Intent(this, FoodListActivity.class);
        startActivity(intent);
    }
}