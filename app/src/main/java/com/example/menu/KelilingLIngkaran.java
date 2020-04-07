package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KelilingLIngkaran extends AppCompatActivity {

    EditText jarijari;
    TextView hasil;
    Button hitung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_lingkaran);

        jarijari = findViewById(R.id.inputJariJari);
        hasil = findViewById(R.id.textViewHasil);
        hitung = findViewById(R.id.btnHitungKelilingLingkaran);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String panjang_sisi = jarijari.getText().toString();
                float r = Float.parseFloat(panjang_sisi);
                double hs = keliling_lingkaran(r);
                String output = String.valueOf(hs);
                hasil.setText("Hasil keliling lingakran dengan jari-jari : " + r + " adalah : " + output.toString());
            }
        });
    }

    public float keliling_lingkaran ( float r){
        return (float) (2*3.14*r);
    }
}
