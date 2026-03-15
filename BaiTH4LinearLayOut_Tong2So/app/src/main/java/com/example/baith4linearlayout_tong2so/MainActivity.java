package com.example.baith4linearlayout_tong2so;

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
    public void  XuLyCong(View v){

    String so1 = editText1.getText().toString();
    String so2 = editText2.getText().toString();
    float soA = Float.parseFloat(so1);
    float soB = Float.parseFloat(so2);
    float tong = soA + soB;

    String chuoiKQ = String.valueOf(tong);
    editTextkq.setText(chuoiKQ);
    }
  public void XuLyTru(View v){

        String so1 = editText1.getText().toString();
        String so2 = editText2.getText().toString();
        float soA = Float.parseFloat(so1);
        float soB = Float.parseFloat(so2);
        float tong = soA - soB;

        String chuoiKQ = String.valueOf(tong);
        editTextkq.setText(chuoiKQ);
    }
   public void XuLyNhan(View v){

        String so1 = editText1.getText().toString();
        String so2 = editText2.getText().toString();
        float soA = Float.parseFloat(so1);
        float soB = Float.parseFloat(so2);
        float tong = soA * soB;

        String chuoiKQ = String.valueOf(tong);
        editTextkq.setText(chuoiKQ);
    }
   public void XuLyChia(View v){

        String so1 = editText1.getText().toString();
        String so2 = editText2.getText().toString();
        float soA = Float.parseFloat(so1);
        float soB = Float.parseFloat(so2);
        float tong = soA / soB;

        String chuoiKQ = String.valueOf(tong);
        editTextkq.setText(chuoiKQ);
    }

}