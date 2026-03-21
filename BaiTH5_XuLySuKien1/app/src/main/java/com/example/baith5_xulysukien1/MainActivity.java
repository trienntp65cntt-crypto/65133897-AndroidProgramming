package com.example.baith5_xulysukien1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    // khai bao cac ddk
    EditText editText1 ;
    EditText editText2;
    EditText editTextkq;
    Button nutCong,nutTru,nutNhan,nutChia;


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
        TimDieuKhien();
        // gắn bộ lắng ngghesujwj kiện và code xử lí
        View.OnClickListener boLangNgheCong = new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                XuLyCong();
            }
        };
        nutCong.setOnClickListener(boLangNgheCong);
        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                XuLyTru();
            }
        });
        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                XuLyNhan();
            }
        });
        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                XuLyChia();
            }
        });
    }
    void TimDieuKhien(){
        editText1 = (EditText)findViewById(R.id.edt1);
        editText2 = (EditText)findViewById(R.id.edt2);
        editTextkq = (EditText)findViewById(R.id.edtKq);
        nutCong = (Button) findViewById(R.id.btnCong);
        nutTru = (Button) findViewById(R.id.btntru);
        nutNhan = (Button) findViewById(R.id.btnNhan);
        nutChia = (Button) findViewById(R.id.btnChia);

    }
    public void  XuLyCong(){

        String so1 = editText1.getText().toString();
        String so2 = editText2.getText().toString();
        float soA = Float.parseFloat(so1);
        float soB = Float.parseFloat(so2);
        float tong = soA + soB;

        String chuoiKQ = String.valueOf(tong);
        editTextkq.setText(chuoiKQ);
    }
    public void XuLyTru(){

        String so1 = editText1.getText().toString();
        String so2 = editText2.getText().toString();
        float soA = Float.parseFloat(so1);
        float soB = Float.parseFloat(so2);
        float tong = soA - soB;

        String chuoiKQ = String.valueOf(tong);
        editTextkq.setText(chuoiKQ);
    }
    public void XuLyNhan(){

        String so1 = editText1.getText().toString();
        String so2 = editText2.getText().toString();
        float soA = Float.parseFloat(so1);
        float soB = Float.parseFloat(so2);
        float tong = soA * soB;

        String chuoiKQ = String.valueOf(tong);
        editTextkq.setText(chuoiKQ);
    }
    public void XuLyChia(){

        String so1 = editText1.getText().toString();
        String so2 = editText2.getText().toString();
        float soA = Float.parseFloat(so1);
        float soB = Float.parseFloat(so2);
        float tong = soA / soB;

        String chuoiKQ = String.valueOf(tong);
        editTextkq.setText(chuoiKQ);
    }

}