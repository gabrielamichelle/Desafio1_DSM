package com.example.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2, et3;
    private TextView tv1, tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_val_a);
        et2 = (EditText)findViewById(R.id.txt_val_b);
        et3 = (EditText)findViewById(R.id.txt_val_c);
        tv1=(TextView)findViewById(R.id.tv_x1);
        tv2=(TextView)findViewById(R.id.tv_x2);

        Button calcular_buttom = findViewById(R.id.btn_calcular);
        calcular_buttom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularRaices(v);
            }
        });
    }

    public void calcularRaices(View view) {
        String val1 = et1.getText().toString();
        String val2 = et2.getText().toString();
        String val3 = et3.getText().toString();

        double op_raiz, raiz, x1, x2;
        double val_a = Double.parseDouble(val1);
        double val_b = Double.parseDouble(val2);
        double val_c = Double.parseDouble(val3);

        if (val_a != 0) {
            op_raiz = Math.pow(val_b, 2) - (4 * val_a * val_c);
            raiz = Math.sqrt(op_raiz);
            x1 = (-val_b + raiz) / (2 * val_a);
            x2 = (-val_b - raiz) / (2 * val_a);

            String res1 = String.valueOf(x1);
            String res2 = String.valueOf(x2);
            tv1.setText("X1: " + res1);
            tv2.setText("X2: " + res2);
        }
        else {
            Toast notificacion= Toast.makeText(this,"ERROR: Datos invalidos >:(",Toast.LENGTH_LONG);
            notificacion.show();
        }
    }
}