package com.android.giovani.aula02;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends ActionBarActivity {
    Button btn;
    EditText v1;
    EditText v2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Porjeto", "Metodo ON CREATE");

        btn = (Button) findViewById(R.id.xBtn);
        v1 = (EditText) findViewById(R.id.xV1);
        v2 = (EditText) findViewById(R.id.xV2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Random n = new Random();
                    int minimo = Integer.parseInt(v1.getText().toString());
                    int maximo = Integer.parseInt(v2.getText().toString());

                    String result = String.valueOf(n.nextInt(maximo));
                    Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"INFORME OS NUMEROS",Toast.LENGTH_LONG).show();
                    Log.i("Projeto", e.getMessage());
                }

            }
        });
    }

        @Override
    protected void onStart() {
        super.onStart();
        Log.i("Porjeto", "Metodo ON START");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Porjeto", "Metodo ON RESTART");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Porjeto", "Metodo ON RESUME");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Porjeto", "Metodo ON STOP");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Porjeto", "Metodo ON DESTROY");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Porjeto", "Metodo ON PAUSE");
    }
}
