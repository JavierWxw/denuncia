package com.example.denuncia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Register_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void CreateAccount(View view) {
    }

    public void Launchloggin(View view) {
        Intent intent = new Intent(this,Login_Activity.class);
        startActivity(intent);
        fileList();
    }
}