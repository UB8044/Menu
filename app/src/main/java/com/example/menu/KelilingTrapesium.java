package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KelilingTrapesium extends AppCompatActivity {

    EditText alas, atap, miring;
    TextView hasil;
    Button hitung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_trapesium);

        alas = findViewById(R.id.inputAlas);
        atap = findViewById(R.id.inputTinggi);
        miring = findViewById(R.id.inputSisiMiring);
        hasil = findViewById(R.id.textViewHasil);
        hitung = findViewById(R.id.btnHitungKelilingTrapesium);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String als = alas.getText().toString();
                String tng = atap.getText().toString();
                String mrg = miring.getText().toString();
                float AB = Float.parseFloat(als);
                float EF = Float.parseFloat(tng);
                float AE = Float.parseFloat(mrg);
                double hs = keliling_trapesium(AB, EF, AE);
                String output = String.valueOf(hs);
                hasil.setText("Keliling trapesium dengan panjang AB : " + AB + " dan panjang EF : " + EF + " dan panjang AE : " + AE + " adalah : " + output.toString());
            }
        });
    }

    public float keliling_trapesium ( float AB, float EF, float AE){
        return (AB+EF+(2*AE));
    }
}
