package com.uaa.controlpersonalizado3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SelectorColores ctlColor;
    private TextView mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ctlColor = (SelectorColores) findViewById(R.id.scColor);
        mensaje = (TextView) findViewById(R.id.mensajeColor);

        ctlColor.setOnColorSelectedListener(new OnColorSelectedListener() {
            @Override
            public void onColorSelected(int color) {
                //aqui se trataria el color seleccionado (parametro 'color')
                StringBuilder colorSeleccionado = new StringBuilder("Color Seleccionado");

                switch (color){
                    case Color.RED:
                        colorSeleccionado.append("Rojo");
                        break;
                    case Color.GREEN:
                        colorSeleccionado.append("Verde");
                        break;
                    case Color.BLUE:
                        colorSeleccionado.append("Azul");
                        break;
                }
                mensaje.setText(colorSeleccionado);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
