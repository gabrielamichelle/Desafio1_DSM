package sv.edu.udb.ejercicio3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import static java.lang.String.valueOf;

public class segundaActivida extends AppCompatActivity {
    private TextView tv_nombre1, tv_isss1, tv_afp1, tv_renta1, tv_liquido1;
    private TextView tv_nombre2, tv_isss2, tv_afp2, tv_renta2, tv_liquido2;
    private TextView tv_nombre3, tv_isss3, tv_afp3, tv_renta3, tv_liquido3;
    private TextView tv_mayor, tv_menor, tv_cantidad;
    // private TextView tv_hora1, tv_hora2, tv_hora3;

    //variables


    int horas1,horas2, horas3;
    double liquidoN1=0,liquidoN1T=0,liquidoN2=0,liquidoN2T=0,liquidoN3=0,liquidoN3T=0;
    double sueldo1 = 0, sueldo2 = 0, sueldo3 = 0;
    double liquido1 = 0, liquido2 = 0, liquido3 = 0;
    double isss1 = 0, isss2 = 0, renta3 = 0;
    double afp1 = 0, afp2 = 0, afp3 = 0;
    double renta1 = 0, renta2 = 0, isss3 = 0;
    double  suMas=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_activida);

        //empleado 1
        tv_nombre1 = (TextView) findViewById(R.id.tv_empleado1_nombre);
        tv_isss1 = (TextView) findViewById(R.id.tv_empleado1_isss);
        tv_afp1 = (TextView) findViewById(R.id.tv_empleado1_afp);
        tv_renta1 = (TextView) findViewById(R.id.tv_empleado1_renta);
        tv_liquido1 = (TextView) findViewById(R.id.tv_empleado1_liquido);
        //empleado 2
        tv_nombre2 = (TextView) findViewById(R.id.tv_empleado2_nombre);
        tv_isss2 = (TextView) findViewById(R.id.tv_empleado2_isss);
        tv_afp2 = (TextView) findViewById(R.id.tv_empleado2_afp);
        tv_renta2 = (TextView) findViewById(R.id.tv_empleado2_renta);
        tv_liquido2 = (TextView) findViewById(R.id.tv_empleado2_liquido);
        //empleado 3
        tv_nombre3 = (TextView) findViewById(R.id.tv_empleado3_nombre);
        tv_isss3 = (TextView) findViewById(R.id.tv_empleado3_isss);
        tv_afp3 = (TextView) findViewById(R.id.tv_empleado3_afp);
        tv_renta3 = (TextView) findViewById(R.id.tv_empleado3_renta);
        tv_liquido3 = (TextView) findViewById(R.id.tv_empleado3_liquido);
        //datos
        tv_mayor = (TextView) findViewById(R.id.tv_smayor);
        tv_menor = (TextView) findViewById(R.id.tv_smenor);
        tv_cantidad = (TextView) findViewById(R.id.tv_smas);


        //recibiendo datos
        Bundle bundle = getIntent().getExtras();
        //empleado1
        String val_nombre1 = bundle.getString("txt_empleado1_nombre");
        String val_cargo1 = bundle.getString("txt_empleado1_cargo");

        //empleado2
        String val_nombre2 = bundle.getString("txt_empleado2_nombre");
        String val_cargo2 = bundle.getString("txt_empleado2_cargo");
        //empleado3
        String val_nombre3 = bundle.getString("txt_empleado3_nombre");
        String val_cargo3 = bundle.getString("txt_empleado3_cargo");

        //horas
        String horas1_t = bundle.getString("txt_empleado1_horas");
        String horas2_t = bundle.getString("txt_empleado2_horas");
        String horas3_t = bundle.getString("txt_empleado3_horas");

        horas1 = Integer.parseInt(horas1_t);
        horas2 = Integer.parseInt(horas2_t);
        horas3 = Integer.parseInt(horas3_t);

        /*int horas1 = Integer.parseInt(val_horas1);
        int horas2 = Integer.parseInt(val_horas2);
        int horas3 = Integer.parseInt(val_horas3);*/
/*
        isss1 = sueldo1 * 0.0525;
        afp1 = sueldo1 * 0.0688;
        renta1 = sueldo1 * 0.1;
        liquido1 = sueldo1 - isss1 - afp1 - renta1;
*/
        //sueldo base empleado1
        if (horas1 > 0 && horas2 > 0 && horas3 > 0 ) {
            if (horas1 <= 160 || horas2 <= 160 || horas3 <= 160) {
                sueldo1 = horas1 * 9.75;
                sueldo2 = horas2 * 9.75;
                sueldo3 = horas3 * 9.75;
            } else if (horas1 > 160 || horas2 > 160 || horas3 > 160) {
                sueldo1 = (160 * 9.75) + ((horas1 - 160) * 11.50);
                sueldo2 = (160 * 9.75) + ((horas2 - 160) * 11.50);
                sueldo3 = (160 * 9.75) + ((horas3 - 160) * 11.50);
            }

            isss1 = sueldo1 * 0.0525;
            afp1 = sueldo1 * 0.0688;
            renta1 = sueldo1 * 0.1;
            liquido1 = sueldo1 - isss1 - afp1 - renta1;

            isss2 = sueldo2 * 0.0525;
            afp2 = sueldo2 * 0.0688;
            renta2 = sueldo2 * 0.1;
            liquido2 = sueldo2 - isss2 - afp2 - renta2;

            isss3 = sueldo3 * 0.0525;
            afp3 = sueldo3 * 0.0688;
            renta3 = sueldo3 * 0.1;
            liquido3 = sueldo3 - isss3 - afp3 - renta3;

/*                liquidoN1 = liquido1 * 0.02;
                liquidoN1T = liquido1 + liquidoN1;
                liquidoN2 = liquido2 * 0.02;
                liquidoN2T = liquido2 + liquidoN2;
                liquidoN3 = liquido3 * 0.02;
                liquidoN3T = liquido3 + liquidoN3;
*/
                //enviando los datosE1
                String descuentoisss1 = valueOf(isss1);
                String descuentoafp1 = valueOf(afp1);
                String descuentorenta1 = valueOf(renta1);

                //enviando los datosE2
                String descuentoisss2 = valueOf(isss2);
                String descuentoafp2 = valueOf(afp2);
                String descuentorenta2 = valueOf(renta2);

                //enviando los datosE3
                String descuentoisss3 = valueOf(isss3);
                String descuentoafp3 = valueOf(afp3);
                String descuentorenta3 = valueOf(renta3);

                //descuentos
            String descuentoliquido1 = valueOf(liquido1);
            String descuentoliquido2 = valueOf(liquido2);
            String descuentoliquido3 = valueOf(liquido3);

            tv_nombre1.setText(val_nombre1);
                tv_isss1.setText(descuentoisss1);
                tv_afp1.setText(descuentoafp1);
                tv_renta1.setText(descuentorenta1);
                tv_liquido1.setText(descuentoliquido1);

                tv_nombre2.setText(val_nombre2);
                tv_isss2.setText(descuentoisss2);
                tv_afp2.setText(descuentoafp2);
                tv_renta2.setText(descuentorenta2);
                tv_liquido2.setText(descuentoliquido2);

                tv_nombre3.setText(val_nombre3);
                tv_isss3.setText(descuentoisss3);
                tv_afp3.setText(descuentoafp3);
                tv_renta3.setText(descuentorenta3);
                tv_liquido3.setText(descuentoliquido3);


            //SUELDO MAYOR
            if (sueldo1 > sueldo2) {
                if (sueldo1 > sueldo3) {
                    tv_mayor.setText(val_nombre1);
                } else {
                    tv_mayor.setText(val_nombre3);
                }
            } else if (sueldo2 > sueldo3) {
                tv_mayor.setText(val_nombre2);
            } else {
                tv_mayor.setText(val_nombre3);
            }

            //SUELDO MENOR
            if (sueldo1 < sueldo2) {
                if (sueldo1 < sueldo3) {
                    tv_menor.setText(val_nombre1);
                } else {
                    tv_menor.setText(val_nombre3);
                }
            } else if (sueldo2 < sueldo3) {
                tv_menor.setText(val_nombre2);
            } else {
                tv_menor.setText(val_nombre3);
            }

            if(sueldo1 > 300 || sueldo2 > 300 || sueldo3 > 300){
                tv_cantidad.setText(val_nombre1);
                tv_cantidad.setText(val_nombre2);
                tv_cantidad.setText(val_nombre3);
            }else{

            }

            /********/

            //CARGOS
            if (val_cargo1 == "Gerente" || val_cargo2 == "Gerente" || val_cargo3 == "Gerente"){
                liquidoN1 = liquido1 * 0.1;
                liquidoN1T = liquido1 + liquidoN1;
                liquidoN2 = liquido2 * 0.1;
                liquidoN2T = liquido2 + liquidoN2;
                liquidoN3 = liquido3 * 0.1;
                liquidoN3T = liquido3 + liquidoN3;
                tv_liquido1.setText(descuentoliquido1);
                tv_liquido2.setText(descuentoliquido2);
                tv_liquido1.setText(descuentoliquido3);
                Toast notificacion = Toast.makeText(this, "DESCUENTO 10% A GERENTE", Toast.LENGTH_LONG);
                notificacion.show();
            }else if(val_cargo1 == "Asistente" || val_cargo2 == "Asistente" || val_cargo3 == "Asistente"){
                liquidoN1 = liquido1 * 0.05;
                liquidoN1T = liquido1 + liquidoN1;
                liquidoN2 = liquido2 * 0.05;
                liquidoN2T = liquido2 + liquidoN2;
                liquidoN3 = liquido3 * 0.05;
                liquidoN3T = liquido3 + liquidoN3;
                Toast notificacion = Toast.makeText(this, "DESCUENTO 5% A ASISTENTE", Toast.LENGTH_LONG);
                notificacion.show();
            }else if(val_cargo1 == "Secretaria" || val_cargo2 == "Secretaria" || val_cargo3 == "Secretaria"){
                liquidoN1 = liquido1 * 0.03;
                liquidoN1T = liquido1 + liquidoN1;
                liquidoN2 = liquido2 * 0.03;
                liquidoN2T = liquido2 + liquidoN2;
                liquidoN3 = liquido3 * 0.03;
                liquidoN3T = liquido3 - liquidoN3;
                Toast notificacion = Toast.makeText(this, "DESCUENTO 10% A SECRETARIA", Toast.LENGTH_LONG);
                notificacion.show();
            }else if (val_cargo1 == "Gerente" && val_cargo2 == "Asistente" && val_cargo3 == "Secretaria"){
                Toast notificacion = Toast.makeText(this, "NO HAY BONO", Toast.LENGTH_LONG);
                notificacion.show();
            }else{
                liquidoN1 = liquido1 * 0.02;
                liquidoN1T = liquido1 - liquidoN1;
                liquidoN2 = liquido2 * 0.02;
                liquidoN2T = liquido2 - liquidoN2;
                liquidoN3 = liquido3 * 0.02;
                liquidoN3T = liquido3 - liquidoN3;
                Toast notificacion = Toast.makeText(this, "DESCUENTO 2% ", Toast.LENGTH_LONG);
                notificacion.show();

            }

        } else {
            Toast notificacion = Toast.makeText(this, "ERROR: Horas no validas", Toast.LENGTH_LONG);
            notificacion.show();
        }
    }

    public void finalizar(View v){

        finish();
    }
}