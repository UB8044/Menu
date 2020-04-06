package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button login;
    EditText user, pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.btnOk);
        user = findViewById(R.id.editUN);
        pass = findViewById(R.id.editPass);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = user.getText().toString();
                String password = pass.getText().toString();

                if (username.equals("admin") && password.equals("123")) {
                    navigation();
                } else {
                    Toast.makeText(getApplicationContext(), "Password Salah", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void navigation() {
        startActivity(new Intent(this, MenuHitung.class));
    }
}
