package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasSegitiga extends AppCompatActivity {

    EditText alas, tinggi;
    TextView hasil;
    Button hitung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_segitiga);

        alas = findViewById(R.id.inputAlas);
        tinggi = findViewById(R.id.inputTinggi);
        hasil = findViewById(R.id.textViewHasil);
        hitung = findViewById(R.id.btnHitungLuasSegitiga);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String als = alas.getText().toString();
                String tng = tinggi.getText().toString();
                float a = Float.parseFloat(als);
                float t = Float.parseFloat(tng);
                double hs = luas_segitiga(a, t);
                String output = String.valueOf(hs);
                hasil.setText("Luas segitiga dengan alas : " + a + " dan tinggi : " + t + output.toString());
            }
        });
    }

    public float luas_segitiga ( float a, float t){
        return (a*t)/2;
    }
}
