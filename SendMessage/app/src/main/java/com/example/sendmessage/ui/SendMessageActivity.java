package com.example.sendmessage.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.sendmessage.ChangeMessageApplication;
import com.example.sendmessage.R;
import com.example.sendmessage.model.Message;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class SendMessageActivity extends AppCompatActivity {

    private EditText etUsuario;
    private EditText etMensaje;
    private FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);
       /* Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/
        etUsuario=(EditText)findViewById(R.id.etUser);
        etMensaje=(EditText)findViewById(R.id.etMessage);
        fab=(FloatingActionButton)findViewById(R.id.fab);

        //Sobreescribimos el método OnClick del floatButtom para hacer que envie los datos a otra Activity.
        fab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                //Comentamos las 2 lineas de bundle para implementar mensaje de la clase Creada Model.Message

                //bundle.putString("user", etUsuario.getText().toString());
                //bundle.putString("message", etMensaje.getText().toString());
                Message message = new Message("15/10/2020",etMensaje.getText(),((ChangeMessageApplication)getApplication().)
                bundle.putSerializable("message",message);

                Enviar(bundle);
            }
        });

    }

    /**
     * Método que se ejecuta cuando se pulsa el botón btAbout
     * Se  implementó mediante el atributo android:onClick en activity sendMessage
     * @param view  botón donde se ha realizado click
     */
    public void showAbout(View view)
    {
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }
//region Métodos manejar Activity
    /**
     *
     * @param bundle encargado de tener guardado los datos
     */
    public void Enviar (Bundle bundle)//Envia los datos a la otra activity
        {
            Intent intent = new Intent(this, ViewMessageActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
        }
        //endregion

}