package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KelilingSegitiga extends AppCompatActivity {

    EditText alas, tinggi, miring;
    TextView hasil;
    Button hitung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_segitiga);

        alas = findViewById(R.id.inputAlas);
        tinggi = findViewById(R.id.inputTinggi);
        miring = findViewById(R.id.inputSisiMiring);
        hasil = findViewById(R.id.textViewHasil);
        hitung = findViewById(R.id.btnHitungKelilingSegitiga);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String als = alas.getText().toString();
                String tng = tinggi.getText().toString();
                String mrg = miring.getText().toString();
                float a = Float.parseFloat(als);
                float t = Float.parseFloat(tng);
                float c = Float.parseFloat(mrg);
                double hs = keliling_segitiga(a, t, c);
                String output = String.valueOf(hs);
                hasil.setText("Keliling persegi panjang dengan alas : " + a + " , tinggi : " + t + " dan sisi miring : " + c + " adalah : " + output.toString());
            }
        });
    }

    public float keliling_segitiga ( float a, float t, float c){
        return (a+t+c);
    }
}
