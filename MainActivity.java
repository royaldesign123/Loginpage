package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);
        MaterialButton loginbt = (MaterialButton) findViewById(R.id.loginbtn);
        loginbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("Bhargav") && password.getText().toString().equals("royal")) {
                    Toast.makeText(MainActivity.this, "LOGIN Sucessful", Toast.LENGTH_SHORT).show();
                }
                    Toast.makeText(MainActivity.this, "Failed", Toast.LENGTH_SHORT).show();
            }


        });
    }
}