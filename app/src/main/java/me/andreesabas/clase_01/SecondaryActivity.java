package me.andreesabas.clase_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        TextView saludo = (TextView) findViewById(R.id.tv_saludo);
        Button aceptar = findViewById(R.id.btn_aceptar);
        Button rechazar = findViewById(R.id.btn_rechazar);

        String nuevo_saludo = getIntent().getStringExtra("tv_saludo");

        saludo.setText("Hola " + nuevo_saludo + " ¿Aceptas las condiciones?");

        aceptar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent( getApplicationContext() ,MainActivity.class);
                startActivity(intent);
            }
        });

        rechazar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent( getApplicationContext() ,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
