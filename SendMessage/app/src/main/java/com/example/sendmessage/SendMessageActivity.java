package com.example.sendmessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

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

        //Sobreescribimos el método OnClick del floatButtom para hacer que envíe
        fab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("user", etUsuario.getText().toString());
                bundle.putString("mensaje", etMensaje.getText().toString());

                Enviar(bundle);
            }
        });

    }
    public void Enviar (Bundle bundle)//Envia los datos a la otra activity
        {
            Intent intent = new Intent(this,ViewMessageActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
        }


}