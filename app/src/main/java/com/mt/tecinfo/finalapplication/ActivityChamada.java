package com.mt.tecinfo.finalapplication;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityChamada extends AppCompatActivity {

    String memoria = "";
    TextView numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chamada);

        numero = (TextView) findViewById(R.id.displayN);
        final Button btn_c = (Button) findViewById(R.id.btn_ap);
        final Button btn1 = (Button) findViewById(R.id.bt_1);
        final Button btn2 = (Button) findViewById(R.id.bt_2);
        final Button btn3 = (Button) findViewById(R.id.bt_3);
        final Button btn4 = (Button) findViewById(R.id.bt_4);
        final Button btn5 = (Button) findViewById(R.id.bt_5);
        final Button btn6 = (Button) findViewById(R.id.bt_6);
        final Button btn7 = (Button) findViewById(R.id.bt_7);
        final Button btn8 = (Button) findViewById(R.id.bt_8);
        final Button btn9 = (Button) findViewById(R.id.bt_9);
        final Button btn0 = (Button) findViewById(R.id.bt_0);
        final Button btnAst = (Button) findViewById(R.id.btn_a);
        final Button btnHash = (Button) findViewById(R.id.btn_hashtag);
        final Button btnLigar = (Button) findViewById(R.id.btn_ligar);

        btn0.setOnClickListener(myListener);
        btn1.setOnClickListener(myListener);
        btn2.setOnClickListener(myListener);
        btn3.setOnClickListener(myListener);
        btn4.setOnClickListener(myListener);
        btn5.setOnClickListener(myListener);
        btn6.setOnClickListener(myListener);
        btn7.setOnClickListener(myListener);
        btn8.setOnClickListener(myListener);
        btn9.setOnClickListener(myListener);
        btnAst.setOnClickListener(myListener);
        btnHash.setOnClickListener(myListener);
        btn_c.setOnClickListener(myListener);
        btnLigar.setOnClickListener(myListener);
    }

    private View.OnClickListener myListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.bt_0:
                    setDisplayText("0");
                    break;
                case R.id.bt_1:
                    setDisplayText("1");
                    break;
                case R.id.bt_2:
                    setDisplayText("2");
                    break;
                case R.id.bt_3:
                    setDisplayText("3");
                    break;
                case R.id.bt_4:
                    setDisplayText("4");
                    break;
                case R.id.bt_5:
                    setDisplayText("5");
                    break;
                case R.id.bt_6:
                    setDisplayText("6");
                    break;
                case R.id.bt_7:
                    setDisplayText("7");
                    break;
                case R.id.bt_8:
                    setDisplayText("8");
                    break;
                case R.id.bt_9:
                    setDisplayText("9");
                    break;
                case R.id.btn_a:
                    setDisplayText("*");
                    break;
                case R.id.btn_hashtag:
                    setDisplayText("#");
                    break;
                case R.id.btn_ap:
                    if (memoria.length() > 0) {
                        memoria = memoria.substring(0,memoria.length() -1);
                        numero.setText(memoria);
                    }
                    break;
                case R.id.btn_ligar:
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + memoria));
                    if (ActivityCompat.checkSelfPermission(ActivityChamada.this,
                            Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(ActivityChamada.this,
                                new String[]{Manifest.permission.CALL_PHONE}, 0);
                    }
                    startActivity(intent);
                    break;
            }
        }
    };

    private void setDisplayText(String valor) {
        memoria = memoria + valor;
        numero.setText(memoria);
    }
}
