package com.example.gwen.audiolibros;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.gwen.audiolibros.fragments.PreferenciasFragment;

public class PreferenciasActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportFragmentManager().beginTransaction().replace(android.R.id.content, new PreferenciasFragment()).commit();
    }
}
