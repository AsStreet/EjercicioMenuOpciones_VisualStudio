package com.example.ejerciciomenuopciones;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

import com.example.ejerciciomenuopciones.Activity.ScrollingASIR;
import com.example.ejerciciomenuopciones.Activity.ScrollingDAM;
import com.example.ejerciciomenuopciones.Activity.ScrollingDAW;

public class MainActivity extends AppCompatActivity {

    // Crear los objetos que voy a vincular a los elementos del layout
    private ImageView asir;
    private ImageView dam;
    private ImageView daw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Vincular los objetos a los elementos
        asir = findViewById(R.id.idIVAsir);
        dam = findViewById(R.id.idIVDam);
        daw = findViewById(R.id.idIVDaw);
        // Registrar los elementos para el ContextMenu
        registerForContextMenu(asir);
        registerForContextMenu(dam);
        registerForContextMenu(daw);
    }

    // Crear este método para poner el menú de opciones en el Activity
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Se infla un menu con la ID del menú de opciones y se devuelve true
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }

    // Crear este método para ver que elemento del menú se ha seleccionado
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent activity;
        switch(item.getItemId()){
            case R.id.idMIAsir:
                activity = new Intent(getApplicationContext(), ScrollingASIR.class);
                startActivity(activity);
                break;
            case R.id.idMIDaw:
                activity = new Intent(getApplicationContext(), ScrollingDAW.class);
                startActivity(activity);
                break;
            case R.id.idMIDam:
                activity = new Intent(getApplicationContext(), ScrollingDAM.class);
                startActivity(activity);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    // Crear este método para el menú contextual
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_opciones, menu);
    }

    // Crear este método para ver que elemento del menú contextual se ha pulsado
    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        Intent activity;
        switch(item.getItemId()){
            case R.id.idMIAsir:
                activity = new Intent(getApplicationContext(), ScrollingASIR.class);
                startActivity(activity);
                break;
            case R.id.idMIDaw:
                activity = new Intent(getApplicationContext(), ScrollingDAW.class);
                startActivity(activity);
                break;
            case R.id.idMIDam:
                activity = new Intent(getApplicationContext(), ScrollingDAM.class);
                startActivity(activity);
                break;
        }
        return super.onContextItemSelected(item);
    }
}