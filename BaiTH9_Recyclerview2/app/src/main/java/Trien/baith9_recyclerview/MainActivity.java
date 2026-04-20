package Trien.baith9_recyclerview;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandAdapter landAdapter;

    RecyclerView recyclerviewdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        };

    ArrayList<LandScape> getRecycleriew(){
        ArrayList<LandScape> dsDuLieu = new ArrayList<LandScape>();

        dsDuLieu.add(new LandScape(" com", "suon"));
        dsDuLieu.add(new LandScape(" com", "suon trung"));
        dsDuLieu.add(new LandScape(" com", "suon db"));
        dsDuLieu.add(new LandScape(" com", "suon xm"));
        return dsDuLieu;
    }
}

