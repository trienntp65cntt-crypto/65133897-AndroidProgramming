package com.trien.onck;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment selecttedFragment = null;
                int itemId = menuItem.getItemId();
                if (itemId == R.id.FragmentSpace){
                    selecttedFragment = new HomeFragment();
                }else if (itemId == R.id.nav_cau1){
                    selecttedFragment = new FragmentCau1();
                }else if (itemId == R.id.nav_cau2){
                    selecttedFragment = new FragmentCau2();
                }else if (itemId == R.id.nav_cau3){
                    selecttedFragment = new FragmentCau3();
                }else if (itemId == R.id.nav_cau4){
                    selecttedFragment = new FragmentCau4();
                }
                if (selecttedFragment != null ){
                    getSupportFragmentManager().beginTransaction().replace(R.id.FragmentSpace,selecttedFragment).commit();
                }
                return true;
            }
        });
    }
}