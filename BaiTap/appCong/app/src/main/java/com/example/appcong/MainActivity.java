package com.example.appcong;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

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
    }
    public void XuLyCong(View view){
        EditText editTextSoA = findViewById(R.id.edta);
        EditText editTextSoB  = findViewById(R.id.edtB);
        EditText editTextKetQua = findViewById(R.id.edtKQ);

        String strA =   editTextSoA.getText().toString();
        String strB =   editTextSoB.getText().toString();

        //chuyen dl sang so
        int so_A = Integer.parseInt(strA);
        int so_B = Integer.parseInt(strB);
        //tinh tong
        int tong = so_A + so_B;
        String strTong = String.valueOf(tong);
        // in ra mh
        editTextKetQua.setText(strTong);
    }
}