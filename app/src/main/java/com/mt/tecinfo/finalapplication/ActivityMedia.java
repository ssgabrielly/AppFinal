package com.mt.tecinfo.finalapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityMedia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);

        final EditText nota1 = (EditText) findViewById(R.id.input1);
        final EditText nota2 = (EditText) findViewById(R.id.input2);
        final EditText nota3 = (EditText) findViewById(R.id.input3);
        final EditText nota4 = (EditText) findViewById(R.id.input4);
        final Button btnC = (Button) findViewById(R.id.btn_calc);
        final TextView dResult = (TextView) findViewById(R.id.displayResultado);

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double v1 = Double.parseDouble(nota1.getText().toString());
                double v2 = Double.parseDouble(nota2.getText().toString());
                double v3 = Double.parseDouble(nota3.getText().toString());
                double v4 = Double.parseDouble(nota4.getText().toString());

                double calc = (v1+v2+v3+v4)/4;
                String media = Double.toString(calc);
                dResult.setText(media);
            }
        });
    }
}
