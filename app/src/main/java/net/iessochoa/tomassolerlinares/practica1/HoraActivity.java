package net.iessochoa.tomassolerlinares.practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HoraActivity extends AppCompatActivity {

    private TextView txtMensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hora);

        //Localizar los controles
        txtMensaje = (TextView)findViewById(R.id.txtMensaje);

        //Recuperamos la información pasada en el intent
        Bundle bundle = this.getIntent().getExtras();

        //Recuperamos el String almacenado en strings.xml
        String texto = getResources().getString(R.string.mensajeHora);
        //Almacenamos los nuevos datos en el String

        String mensajeCompleto = String.format(texto, bundle.getString("HORA"), bundle.getString("NOMBRE"));
        //Construimos el mensaje a mostrar
        txtMensaje.setText(mensajeCompleto);
    }
}