package com.example.firsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityKedua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        TextView tv = findViewById(R.id.tv_text);
        TextView tw = findViewById(R.id.tw_text);


        Bundle ambil = getIntent().getExtras();
        if (ambil == null) {
            return;
        }
        String nama = ambil.getString("nama_key");
        String alamat =ambil.getString("alamat_key");

        if (nama != null){
            tv.setText(nama);
        }
        if (alamat != null){
        tw.setText(alamat);
        }
    }
}