package me.andreesabas.clase_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton = findViewById(R.id.btn_verificar);


        myButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {

                EditText name = (EditText) findViewById(R.id.et_name);

                String name_1 = name.getText().toString();

                Intent intent = new Intent( getApplicationContext() ,SecondaryActivity.class);
                intent.putExtra("tv_saludo", name_1);
                startActivity(intent);
            }
        });
    }


}
