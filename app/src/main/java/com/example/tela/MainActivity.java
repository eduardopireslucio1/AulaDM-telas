package com.example.tela;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal);
    }

    public void carregaMenu(View v){
        setContentView(R.layout.menu_principal);
    }

    public void carregaConstraintLayout(View v){
        setContentView(R.layout.activity_main);
    }

    public void carregaTableLayout(View v){
        setContentView(R.layout.tabela_layout);
    }
}