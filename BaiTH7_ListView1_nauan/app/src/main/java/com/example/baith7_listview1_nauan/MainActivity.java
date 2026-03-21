package com.example.baith7_listview1_nauan;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //khai bao
        ArrayList<String> dsmonan = new ArrayList<String>();
        // them
        dsmonan.add("Mon An 1");
        dsmonan.add("Mon An 2");
        dsmonan.add("Mon An 3");
        dsmonan.add("...");
        dsmonan.add("...");
        dsmonan.add("...");
        //tao adapter
        ArrayAdapter<String> adaptermonan = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dsmonan);
        // tim
        ListView dsMonAn = findViewById(R.id.lvdsma);
        // gan
        dsMonAn.setAdapter(adaptermonan);
    }
}