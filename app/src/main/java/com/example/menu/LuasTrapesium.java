package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasTrapesium extends AppCompatActivity {

    EditText alas, atap, tinggi;
    TextView hasil;
    Button hitung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_trapesium);

        alas = findViewById(R.id.inputAlas);
        atap = findViewById(R.id.inputAtap);
        tinggi = findViewById(R.id.inputTinggi);
        hasil = findViewById(R.id.textViewHasil);
        hitung = findViewById(R.id.btnHitungLuasTrapesium);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String als = alas.getText().toString();
                String tng = atap.getText().toString();
                String mrg = tinggi.getText().toString();
                float AB = Float.parseFloat(als);
                float EF = Float.parseFloat(tng);
                float t = Float.parseFloat(mrg);
                double hs = luas_trapesium(AB, EF, t);
                String output = String.valueOf(hs);
                hasil.setText("Hasil luas trapesium dengan panjang AB : " + AB + " dan panjang EF : " + EF + " dan tinggi : " + t + " adalah : " + output.toString());
            }
        });
    }

    public float luas_trapesium ( float AB, float EF, float t){
        return (float) (0.5*(AB+EF)*t);
    }
}
