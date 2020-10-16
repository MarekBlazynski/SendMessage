package com.example.sendmessage.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.widget.TextView;

import com.example.sendmessage.R;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

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
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_message);

        Logger.addLogAdapter(new AndroidLogAdapter());

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