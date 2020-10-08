package com.example.sendmessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * <h1>Funcionalidad de la clase</h1>
 * En la siguiente clase se recibe la información enviada por el objecto {@link android.os.Bundle} a través del objecto {@link android.content.Intent}*
 *
 * @author Marek Blazynski
 * @Version 1.0 | 8 de Octubre
 * */
public class ViewMessageActivity extends AppCompatActivity {
private TextView  tvViewUser;
private TextView tvViewMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_message);
        tvViewUser = (TextView)findViewById(R.id.tvUsuario);
        tvViewMessage = (TextView)findViewById(R.id.tvMessage);

        Intent intent = getIntent();  //Devuelvo el Intent que empezó esta activity, que es SendMessageActivity.java
        Bundle bundle = intent.getExtras(); //Todos los datos conseguidos tras utilizar el método getExtras() en la activity SendMessageActivity.java

        /**
         * Asignamos los textos correspondientes a cada componente gráfico a través de bundle.getString y la clave previamente asiganada en bundle.putString()
         */
        tvViewUser.setText(bundle.getString("user"));
        tvViewMessage.setText(bundle.getString("message"));






    }
}