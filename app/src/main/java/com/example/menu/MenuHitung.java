package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

public class MenuHitung extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{

    final int[] index = {1, 2, 3, 4, 5};
    Button persegi, lingkaran, persegipanjang, segitiga, trapesium, exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_hitung);

        exit = findViewById(R.id.out);
        persegi = findViewById(R.id.btnPersegi);
        lingkaran = findViewById(R.id.btnLingkaran);
        persegipanjang = findViewById(R.id.btnPersegiPanjang);
        segitiga = findViewById(R.id.btnSegitiga);
        trapesium = findViewById(R.id.btnTrapesium);



        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index[0] = 1;
                PopupMenu ppMenu = new PopupMenu(MenuHitung.this, v);
                ppMenu.setOnMenuItemClickListener(MenuHitung.this);
                ppMenu.inflate(R.menu.optionmenu);
                ppMenu.show();
            }
        });

        lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index[0] = 2;
                PopupMenu ppMenu = new PopupMenu(MenuHitung.this, v);
                ppMenu.setOnMenuItemClickListener(MenuHitung.this);
                ppMenu.inflate(R.menu.optionmenu);
                ppMenu.show();
            }
        });

        persegipanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index[0] = 3;
                PopupMenu ppMenu = new PopupMenu(MenuHitung.this, v);
                ppMenu.setOnMenuItemClickListener(MenuHitung.this);
                ppMenu.inflate(R.menu.optionmenu);
                ppMenu.show();
            }
        });

        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index[0] = 4;
                PopupMenu ppMenu = new PopupMenu(MenuHitung.this, v);
                ppMenu.setOnMenuItemClickListener(MenuHitung.this);
                ppMenu.inflate(R.menu.optionmenu);
                ppMenu.show();
            }
        });

        trapesium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index[0] = 5;
                PopupMenu ppMenu = new PopupMenu(MenuHitung.this, v);
                ppMenu.setOnMenuItemClickListener(MenuHitung.this);
                ppMenu.inflate(R.menu.optionmenu);
                ppMenu.show();
            }
        });
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.luas:
                if (index[0] == 1){
                    startActivity(new Intent(this, LuasPersegi.class));
                } else if (index[0] == 2){
                    startActivity(new Intent(this, LuasLingkaran.class));
                } else if (index[0] == 3){
                    startActivity(new Intent(this, LuasPersegiPanjang.class));
                } else if (index[0] == 4){
                    startActivity(new Intent(this, LuasSegitiga.class));
                } else if (index[0] == 5){
                    startActivity(new Intent(this, LuasTrapesium.class));
                }
                break;
            case R.id.keliling:
                if (index[0] == 1){
                    startActivity(new Intent(this, KelilingPersegi.class));
                } else if (index[0] == 2){
                    startActivity(new Intent(this, KelilingLIngkaran.class));
                } else if (index[0] == 3){
                    startActivity(new Intent(this, KelilingPersegiPanjang.class));
                } else if (index[0] == 4){
                    startActivity(new Intent(this, KelilingSegitiga.class));
                } else if (index[0] == 5){
                    startActivity(new Intent(this, KelilingTrapesium.class));
                }
                break;
        }
        return true;
    }
}

