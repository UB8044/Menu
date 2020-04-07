package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasPersegiPanjang extends AppCompatActivity {

    EditText panjang, lebar;
    TextView hasil;
    Button hitung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_persegi_panjang);

        panjang = findViewById(R.id.inputPanjang);
        lebar = findViewById(R.id.inputLebar);
        hasil = findViewById(R.id.textViewHasil);
        hitung = findViewById(R.id.btnHitungLuasPersegiPanjang);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pnjg = panjang.getText().toString();
                String lbr = lebar.getText().toString();
                float p = Float.parseFloat(pnjg);
                float l = Float.parseFloat(lbr);
                double hs = keliling_persegi_panjang(p, l);
                String output = String.valueOf(hs);
                hasil.setText("Hasir luas persegi panjang dengan panjang : " + p + " dan lebar : " + l + " adalah : " + output.toString());
            }
        });
    }

    public float keliling_persegi_panjang ( float p, float l){
        return (p*l);
    }
}
