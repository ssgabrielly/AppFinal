package com.mt.tecinfo.finalapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityCalculadora extends AppCompatActivity {

    private String memoria;
    private String operacao;
    private double valor1 = 0;
    private double valor2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        final Button btn0 = (Button) findViewById(R.id.btn_0);
        final Button btn1 = (Button) findViewById(R.id.btn_1);
        final Button btn2 = (Button) findViewById(R.id.btn_2);
        final Button btn3 = (Button) findViewById(R.id.btn_3);
        final Button btn4 = (Button) findViewById(R.id.btn_4);
        final Button btn5 = (Button) findViewById(R.id.btn_5);
        final Button btn6 = (Button) findViewById(R.id.btn_6);
        final Button btn7 = (Button) findViewById(R.id.btn_7);
        final Button btn8 = (Button) findViewById(R.id.btn_8);
        final Button btn9 = (Button) findViewById(R.id.btn_9);
        final Button btnSoma = (Button) findViewById(R.id.btn_soma);
        final Button btnSub = (Button) findViewById(R.id.btn_subtracao);
        final Button btnMult = (Button) findViewById(R.id.btn_multiplicacao);
        final Button btnDiv = (Button) findViewById(R.id.btn_divisao);
        final Button btnC = (Button) findViewById(R.id.btn_apagar);
        final Button btnVirg = (Button) findViewById(R.id.btn_virgula);
        final Button btnIgual = (Button) findViewById(R.id.btn_igual);

        final TextView dConta = (TextView) findViewById(R.id.displayConta);
        final TextView dResult = (TextView) findViewById(R.id.displayResultado);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                memoria = (String) dConta.getText();
                dConta.setText(memoria + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                memoria = (String) dConta.getText();
                dConta.setText(memoria + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                memoria = (String) dConta.getText();
                dConta.setText(memoria + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                memoria = (String) dConta.getText();
                dConta.setText(memoria + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                memoria = (String) dConta.getText();
                dConta.setText(memoria + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                memoria = (String) dConta.getText();
                dConta.setText(memoria + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                memoria = (String) dConta.getText();
                dConta.setText(memoria + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                memoria = (String) dConta.getText();
                dConta.setText(memoria + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                memoria = (String) dConta.getText();
                dConta.setText(memoria + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                memoria = (String) dConta.getText();
                dConta.setText(memoria + "9");
            }
        });

        btnVirg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                memoria = (String) dConta.getText();
                dConta.setText(memoria + ",");
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                memoria = "";
                dConta.setText("");
                dResult.setText("");
            }
        });

        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operacao = "+";
                valor1 = Double.parseDouble(dConta.getText().toString());
                dResult.setText(dConta.getText().toString() + "+");
                dConta.setText("");
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operacao = "-";
                valor1 = Double.parseDouble(dConta.getText().toString());
                dResult.setText(dConta.getText().toString() + "-");
                dConta.setText("");
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operacao = "*";
                valor1 = Double.parseDouble(dConta.getText().toString());
                dResult.setText(dConta.getText().toString() + "*");
                dConta.setText("");
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operacao = "/";
                valor1 = Double.parseDouble(dConta.getText().toString());
                dResult.setText(dConta.getText().toString() + "/");
                dConta.setText("");
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (dConta.getText().equals("")) {
                    Toast.makeText(getApplicationContext(), "Digite um número!", Toast.LENGTH_LONG).show();
                } else {
//                    operacao = "=";
                    valor2 = Double.parseDouble(dConta.getText().toString());
                    dConta.setText("");
                    String resultado = calcular(valor1, valor2, operacao);
                    dResult.setText(resultado);
                }
            }
        });

    }

    public String calcular(Double valor1, Double valor2, String operacao) {
        Double resultado = 0.0;
        if (operacao.equals("+")) {
            resultado = valor1 + valor2;
        } else if (operacao.equals("-")) {
            resultado = valor1 - valor2;
        } else if (operacao.equals("*")) {
            resultado = valor1 * valor2;
        } else if (operacao.equals("/")) {
            if (valor2 == 0){
                Toast.makeText(getApplicationContext(), "Não é possível dividir por 0!", Toast.LENGTH_LONG).show();
            } else {
                resultado = valor1 / valor2;
            }
        }
        return resultado.toString();
    }
}
