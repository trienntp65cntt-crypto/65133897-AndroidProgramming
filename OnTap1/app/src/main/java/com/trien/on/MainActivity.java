package com.trien.on;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsTenTinhThanh = new ArrayList<String>(); // xin moi
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        // hiển thị listview
        //b1: cần dữ liệu
        // cần biến để chứa dl

        // them dl vao
        dsTenTinhThanh.add("Ha Noi");
        dsTenTinhThanh.add("tp HCM");
        dsTenTinhThanh.add("Dong NAi");
        dsTenTinhThanh.add("Binh Thuan");
        dsTenTinhThanh.add("Ninh Thuan");

        //b2 tao adapter
        ArrayAdapter<String> adapterTinhThanh = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dsTenTinhThanh);

        // b3 gan vao dk hien thi

        ListView lvTenTinh = findViewById(R.id.lvdstt);
        //3.2
        lvTenTinh.setAdapter(adapterTinhThanh);

        //3.3 lang nghe
        lvTenTinh.setOnItemClickListener((AdapterView.OnItemClickListener) BoLangNghe);


    }

    // tao bo lang nghe
    AdapterView.OnItemClickListener BoLangNghe = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            // code
            String tenTinhCHon =  dsTenTinhThanh.get(i);
            Toast.makeText(MainActivity.this," ba vua chhonj : "+tenTinhCHon,Toast.LENGTH_LONG).show();
        }


    };

}