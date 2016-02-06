package mx.com.wong.demo.ejemplolistas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Listas extends AppCompatActivity {
    private String arrayDato[];
    ArrayAdapter<String> adapter;
    private Spinner opciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listas_layout);
        //Creando un array de n dimensión.

        arrayDato=generarItemsArray(5);
        crearArrayAdapter(arrayDato);
        opciones =(Spinner) findViewById(R.id.spinner_datos);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        opciones.setAdapter(adapter);

    }


    public String[] generarItemsArray(int a){
        String[] datos=new String[a];
        for(int i=0; i<=datos.length-1; i++){
            datos[i]="Elemento"+(i+1);
        }
        return datos;
    }

    public void muestraMensajeLog(String a){
        Log.i("MENSAJE", a);
    }

    public void crearArrayAdapter(String[] array){
         adapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, array);
    }
}
