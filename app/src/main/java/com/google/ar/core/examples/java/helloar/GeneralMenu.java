package com.google.ar.core.examples.java.helloar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GeneralMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_menu);
    }

    public void btnAcrivityAR(View view) {
        Intent intent = new Intent(GeneralMenu.this, HelloArActivity.class);
        startActivity(intent);
    }

    public void btnAboutClick(View view) {
        Intent intent = new Intent(GeneralMenu.this, About.class);
        startActivity(intent);
    }

    public void btnInfoProjectClick(View view) {
        Intent intent = new Intent(GeneralMenu.this, Info.class);
        startActivity(intent);
    }

    public void btnMapsClick(View view) {
        Intent intent = new Intent(GeneralMenu.this, MapsActivity.class);
        startActivity(intent);
    }
}