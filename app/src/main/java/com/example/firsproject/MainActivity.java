package com.example.firsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public int jumlah = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         TextView txtHW = findViewById(R.id.tv_hw);
         final TextView txtnama = findViewById(R.id.tv_nama);
         final TextView txtalamat = findViewById(R.id.tv_alamat);
        Button btnMove =findViewById(R.id.btn_pindah);

        txtHW.setText("Selamat datang ");
        txtnama.setText("Fuad Hidayat");
        txtalamat.setText("Bogor");

        txtnama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Anda menekan tulisan "+txtnama.getText(),
                        Toast.LENGTH_SHORT).show();
            }
        });
        txtalamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Anda menekan tulisan alamat",
                        Toast.LENGTH_SHORT).show();
            }
        });
        txtHW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jumlah++;
                Toast.makeText(getApplicationContext(), "Anda menekan sebanyak " +jumlah+" Kali",
                        Toast.LENGTH_SHORT).show();
            }
        });
        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityKedua.class);
                intent.putExtra("nama_key",txtnama.getText());
                intent.putExtra("alamat_key",txtalamat.getText());
                startActivity(intent);
                //     finish();
//                onDestroy();
            }
        });

    }
}