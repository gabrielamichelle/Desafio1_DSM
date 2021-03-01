package sv.edu.udb.ejercicio3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private EditText et_nombre1, et_nombre2, et_nombre3, et_horas1, et_horas2, et_horas3, et_cargo1, et_cargo2, et_cargo3;
    //private RadioGroup rdg_empleado1, rdg_empleado2, rdg_empleado3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //textbox nombres
        et_nombre1 = (EditText)findViewById(R.id.txt_empleado1_nombre);
        et_nombre2 = (EditText)findViewById(R.id.txt_empleado2_nombre);
        et_nombre3 = (EditText)findViewById(R.id.txt_empleado3_nombre);
        //textbox horas
        et_horas1 = (EditText)findViewById(R.id.txt_empleado1_horas);
        et_horas2 = (EditText)findViewById(R.id.txt_empleado2_horas);
        et_horas3 = (EditText)findViewById(R.id.txt_empleado3_horas);
        //textbox cargos
        et_cargo1 = (EditText)findViewById(R.id.txt_empleado1_cargo);
        et_cargo2 = (EditText)findViewById(R.id.txt_empleado2_cargo);
        et_cargo3 = (EditText)findViewById(R.id.txt_empleado3_cargo);
    }

    public void segundaActivida (View v){
        Intent i = new Intent(this, segundaActivida.class);
        //datos de los nombres
        i.putExtra("txt_empleado1_nombre", et_nombre1.getText().toString());
        i.putExtra("txt_empleado2_nombre", et_nombre2.getText().toString());
        i.putExtra("txt_empleado3_nombre", et_nombre3.getText().toString());
        //datos de las horas
        i.putExtra("txt_empleado1_horas", et_horas1.getText().toString());
        i.putExtra("txt_empleado2_horas", et_horas2.getText().toString());
        i.putExtra("txt_empleado3_horas", et_horas3.getText().toString());
        //datos de los cargos
        i.putExtra("txt_empleado1_cargo", et_cargo1.getText().toString());
        i.putExtra("txt_empleado2_cargo", et_cargo2.getText().toString());
        i.putExtra("txt_empleado3_cargo", et_cargo3.getText().toString());
        //iniciando actividad2
        startActivity(i);
    }
}