package com.example.baith7_listview1;

import android.os.Bundle;
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
        // hieenj du lieu
        //b1: can du lieu
        // hard code tt
        ArrayList<String> dsVatLieu = new ArrayList<String>();// xin moi
        dsVatLieu.add("Xi Mang");
        dsVatLieu.add("Gach");
        dsVatLieu.add("Da op Lap");
        dsVatLieu.add("Ong Nhua");
        dsVatLieu.add("Son Chong Tham");
        dsVatLieu.add("...");

        // b2 tao adapter
        ArrayAdapter<String> adapterVatLieu = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dsVatLieu);
        // b3 gan vao dk hien thi
        //3.1 tim
        ListView lvvl = findViewById(R.id.lvdsvl);
        // 3.2 gan
        lvvl.setAdapter(adapterVatLieu);
        //3.3 lang nghe va xu ly




    }
}