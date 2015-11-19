package com.android.giovani.aula02;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity2Activity extends ActionBarActivity {
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);
        resultado = (TextView) findViewById(R.id.xV1);
        resultado.setText(getIntent().getExtras().getString("Valor Sorteado"));
    }



}
