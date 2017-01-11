package com.example.johnny.a18_android_personalizar_list_view_2;

import android.app.Activity;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Vector;

/**
 * Created by Johnny on 10/01/2017.
 */
public class MiAdaptador extends BaseAdapter {

    private final Activity actividad;
    private final Vector<String> lista;

    public MiAdaptador(Activity actividad, Vector<String> lista) {
        super();
        this.actividad = actividad;
        this.lista = lista;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = actividad.getLayoutInflater();
        View view = inflater.inflate(R.layout.elemento_lista, null);
        TextView textView = (TextView) view.findViewById(R.id.titulo);
        textView.setText(lista.elementAt(position));

        ImageView imageView = (ImageView) view.findViewById(R.id.icono);

        switch (Math.round((float) Math.random() * 3)) {
            case 0:
                imageView.setImageResource(R.mipmap.iconusersmall);
                view.setBackgroundColor(Color.YELLOW);
                break;
            case 1:
                imageView.setImageResource(R.mipmap.iconuser2small);
                view.setBackgroundColor(Color.GREEN);
                break;
            default:
                imageView.setImageResource(R.mipmap.iconuser3small);
                view.setBackgroundColor(Color.CYAN);
                break;
        }
        return view;
    }

    public int getCount() {
        return lista.size();
    }

    public Object getItem(int arg0) {
        return lista.elementAt(arg0);
    }

    public long getItemId(int position) {
        return position;
    }
}
