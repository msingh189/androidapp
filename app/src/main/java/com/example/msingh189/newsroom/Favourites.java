package com.example.msingh189.newsroom;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class Favourites extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourites);

        BottomNavigationView bottomNavigationView =(BottomNavigationView) findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){

                    case R.id.nav_home:
                        Intent intent1 = new Intent(Favourites.this, Home.class);
                        startActivity(intent1);
                        break;

                    case R.id.nav_fav:
                        break;

                    case R.id.nav_pro:
                        Intent intent2 = new Intent(Favourites.this, Profile.class);
                        startActivity(intent2);
                        break;
                }
                return false;
            }
        });
    }
}
