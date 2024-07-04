package Principal;

import Archivos.GeneracionDeHistorial;
import Calculos.CalculoConversion;
import Conexion.ConsultaMoneda;
import Modelos.Moneda;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalConversor {
    public static void main(String[] args) {

        Scanner monedaEntrante = new Scanner(System.in);
        Scanner monedaSaliente = new Scanner(System.in);
        Scanner cantidadAConvertirScanner = new Scanner(System.in);
        CalculoConversion calculoConversion = new CalculoConversion();
        Scanner permanecerEnElFlujo = new Scanner(System.in);
        List<String> listaDeMonedas = new ArrayList<>();
        GeneracionDeHistorial generarHistorial = new GeneracionDeHistorial();
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
      try {

          while (true){


            try {
                System.out.println("Introduce la moneda a convertir (por ejemplo, USD): ");
                String monedaAConvertir = monedaEntrante.nextLine().toUpperCase().trim();

                System.out.println("Introduce la moneda de destino (por ejemplo, ALL): ");
                String monedaDeDestino = monedaSaliente.nextLine().toUpperCase().trim();

                System.out.println("Introduzca la cantidad a convertir");
                double cantidadAConvertir = cantidadAConvertirScanner.nextDouble();

                String respuesta = calculoConversion.ConvertirMoneda(monedaAConvertir,monedaDeDestino,cantidadAConvertir);

                System.out.println("Conversion: " +respuesta);

                listaDeMonedas.add(gson.toJson(respuesta));

                System.out.println("Si desea salir del programa, digite la palabra: salir");
                System.out.println("Si desea seguir convirtiendo presione la tecla enter");
                String estado = permanecerEnElFlujo.nextLine();
                if (estado.equals("salir")) break;
            }catch (RuntimeException e){
                System.out.println("Ocurrio un error : "+e.getMessage());
            }
          }

          generarHistorial.registroDeHistorial(listaDeMonedas);

      }catch (RuntimeException e){
          System.out.println("Ocurrio un error: "+e.getMessage());
      }



    }

}
