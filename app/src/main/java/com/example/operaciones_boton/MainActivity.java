package com.example.operaciones_boton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText e1, e2;
    private TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = findViewById(R.id.et1);
        e2 = findViewById(R.id.et2);
        t1 = findViewById(R.id.tv1);

    }


    public void sumar(View view){
        String v1 = e1.getText().toString();
        String v2 = e2.getText().toString();
        int vl1 = Integer.parseInt(v1);
        int vl2 = Integer.parseInt(v2);
        int sum = vl1 + vl2;
        String msj = String.valueOf(sum);
        t1.setText(msj);
    }

    public void restar(View view){
        String v1 = e1.getText().toString();
        String v2 = e2.getText().toString();
        int vl1 = Integer.parseInt(v1);
        int vl2 = Integer.parseInt(v2);
        int res = vl1 - vl2;
        String msj = String.valueOf(res);
        t1.setText(msj);
    }

    public void multiplicar(View view){
        String v1 = e1.getText().toString();
        String v2 = e2.getText().toString();
        int vl1 = Integer.parseInt(v1);
        int vl2 = Integer.parseInt(v2);
        int mul = vl1 * vl2;
        String msj = String.valueOf(mul);
        t1.setText(msj);
    }

    public void division(View view){
        String v1 = e1.getText().toString();
        String v2 = e2.getText().toString();
        int vl1 = Integer.parseInt(v1);
        int vl2 = Integer.parseInt(v2);
        if (vl2!=0){
            int div = vl1 / vl2;
            String msj = String.valueOf(div);
            t1.setText(msj);
        }else{
            t1.setText("No es posible dividir entre 0");
        }



    }

}