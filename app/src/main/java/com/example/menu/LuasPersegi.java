package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasPersegi extends AppCompatActivity {

    EditText sisi;
    TextView hasil;
    Button hitung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_persegi);

        sisi = findViewById(R.id.inputSisi);
        hasil = findViewById(R.id.textViewHasil);
        hitung = findViewById(R.id.btnHitungLuasPersegi);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String panjang_sisi = sisi.getText().toString();
                float s = Float.parseFloat(panjang_sisi);
                double hs = luas_persegi(s);
                String output = String.valueOf(hs);
                hasil.setText("Hasil keliling persegi dengan sisi : " + s + " adalah : " + output.toString());
            }
        });
    }

    public float luas_persegi ( float s){
        return (s*s);
    }
}
