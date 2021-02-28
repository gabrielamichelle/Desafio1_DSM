package com.example.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private TextView tv1, tv2, tv3, tv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_votos);
        tv1 = (TextView)findViewById(R.id.lbl_candidato1);
        tv2 = (TextView)findViewById(R.id.lbl_candidato2);
        tv3 = (TextView)findViewById(R.id.lbl_candidato3);
        tv4 = (TextView)findViewById(R.id.lbl_candidato4);

        //boton Finalizar
        Button finalizar_buttom = findViewById(R.id.btn_finalizar);
        finalizar_buttom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conteo_votos(v);
            }
        });
    }

    private void conteo_votos(View view) {
        int cand1=0, cand2=0, cand3=0, cand4=0, p_votos1, p_votos2, p_votos3, p_votos4;
        String cadena = et1.getText().toString();
        String[] listVotos = cadena.split(",");
        int hasta = listVotos.length;
        for (int i = 0; i < listVotos.length; i++){
            if (listVotos[i].equals("1")){
                cand1++;
            }
            else if (listVotos[i].equals("2")){
                cand2++;
            }
            else if (listVotos[i].equals("3")){
                cand3++;
            }
            else if (listVotos[i].equals("4")){
                cand4++;
            }
            else{
                hasta = hasta - 1;
                Toast notificacion= Toast.makeText(this,"ERROR: Voto invalido :(", Toast.LENGTH_LONG);
                notificacion.show();
            }
        }

        String votos1 = String.valueOf(cand1);
        String votos2 = String.valueOf(cand2);
        String votos3 = String.valueOf(cand3);
        String votos4 = String.valueOf(cand4);

        p_votos1 = (cand1*100)/hasta;
        p_votos2 = (cand2*100)/hasta;
        p_votos3 = (cand3*100)/hasta;
        p_votos4 = (cand4*100)/hasta;

        tv1.setText("Candidato 1-> Votos: " + votos1 + " [" + p_votos1 + "%]");
        tv2.setText("Candidato 2-> Votos: " + votos2 + " [" + p_votos2 + "%]");
        tv3.setText("Candidato 3-> Votos: " + votos3 + " [" + p_votos3 + "%]");
        tv4.setText("Candidato 4-> Votos: " + votos4 + " [" + p_votos4 + "%]");
    }
}