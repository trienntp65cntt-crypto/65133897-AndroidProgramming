package com.trien.vieccanlam;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<TASKS> lstVCL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //tạo kết nói csdl
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference= database.getReference("TASK");
        // lang nghe va xu li
        lstVCL = new ArrayList<TASKS>();
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                // lay du lieu tu bein snashot, dua va mot bien danh sach
                for ( DataSnapshot obj : snapshot.getChildren()) {
                 TASKS task =    obj.getValue(TASKS.class);
                 lstVCL.add(task);
                    Log.w("vcl app" ,"tenviec can lam" +  task.getName());
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}