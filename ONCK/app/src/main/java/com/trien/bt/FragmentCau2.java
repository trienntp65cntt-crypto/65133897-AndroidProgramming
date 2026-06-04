package com.trien.bt;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class FragmentCau2 extends Fragment {





    public FragmentCau2() {

    }


    public static FragmentCau2 newInstance(String param1, String param2) {
        FragmentCau2 fragment = new FragmentCau2();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cau2, container, false);

        ArrayList<String> dsTenTinhThanh = new ArrayList<String>();// xin moi
        dsTenTinhThanh.add("Xi Mang");
        dsTenTinhThanh.add("Gach");
        dsTenTinhThanh.add("Da op Lap");
        dsTenTinhThanh.add("Ong Nhua");
        dsTenTinhThanh.add("Son Chong Tham");
        dsTenTinhThanh.add("...");


        ArrayAdapter<String> adapterTinhThanh = new ArrayAdapter<String>(requireContext(), android.R.layout.simple_list_item_1, dsTenTinhThanh);
        // b3 gan vao dk hien thi
        //3.1 tim
        ListView lvtt = view.findViewById(R.id.lvTT);
        // 3.2 gan
        lvtt.setAdapter(adapterTinhThanh);
        //3.3 lang nghe va xu ly


        return view;
    }
}