package com.example.johnny.a18_android_personalizar_list_view_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.Vector;

public class MainActivity extends AppCompatActivity {

    private Vector<String> paises = new Vector<String>();

    private ListView lstPaises;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llenarLista();
        lstPaises = (ListView) findViewById(R.id.listView1);
        MiAdaptador adapter = new MiAdaptador(this, paises);
        lstPaises.setAdapter(adapter);
    }


    public void llenarLista() {
        paises.add("Argentina");
        paises.add("Chile");
        paises.add("Paraguay");
        paises.add("Bolivia");
        paises.add("Peru");
        paises.add("Ecuador");
        paises.add("Brasil");
        paises.add("Colombia");
        paises.add("Venezuela");
        paises.add("Uruguay");
        paises.add("Mexico");
        paises.add("Panama");
    }

}
