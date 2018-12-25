package com.example.msingh189.newsroom;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        BottomNavigationView bottomNavigationView =(BottomNavigationView) findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){

                    case R.id.nav_home:
                        Intent intent1 = new Intent(Profile.this, Home.class);
                        startActivity(intent1);
                        break;

                    case R.id.nav_fav:
                        Intent intent2 = new Intent(Profile.this, Favourites.class);
                        startActivity(intent2);
                        break;

                    case R.id.nav_pro:
                        break;
                }
                return false;
            }
        });
    }
}
