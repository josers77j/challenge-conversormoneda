package Calculos;

import Conexion.ConsultaMoneda;
import Modelos.Moneda;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class CalculoConversion {

    public String ConvertirMoneda(String monedaAConvertir, String monedaDeDestino,double cantidadAConvertir){



        ConsultaMoneda consultaMoneda = new ConsultaMoneda();
        String message = consultaMoneda.consultaDeMoneda(monedaAConvertir);

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        Moneda moneda = gson.fromJson(message,Moneda.class);

        Double ma = moneda.getConversion_rates().get(monedaAConvertir);
        Double md = moneda.getConversion_rates().get(monedaDeDestino);

        double conversion = cantidadAConvertir * md;

        String respuesta = String.format("La conversion de %.2f %s a %s es de %.2f %s" , cantidadAConvertir, monedaAConvertir, monedaDeDestino, conversion,monedaDeDestino);


        return respuesta;
    }
}
