package Principal;

import Archivos.GeneracionDeHistorial;
import Calculos.CalculoConversion;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.*;

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
        Date now = new Date();
        String fechaHoraActualizacion;
        Map<String, String> conversion = new HashMap<>();
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
                fechaHoraActualizacion = String.format("%tF %<tT", now);


                conversion.put( "registro: ", respuesta);
                conversion.put( "registrado en: ", fechaHoraActualizacion);

                String jsonConversion = gson.toJson(conversion);

                listaDeMonedas.add(jsonConversion);

                System.out.println("Si desea salir del programa, digite la palabra: salir");
                System.out.println("Si desea seguir convirtiendo presione la tecla enter");
                String estado = permanecerEnElFlujo.nextLine().trim();
                if (estado.equals("salir")) break;
            }catch (InputMismatchException e){
                System.out.println("Error: por favor, ingrese una cantidad valida.");
                cantidadAConvertirScanner.next();
            }
            catch (RuntimeException e){
                System.out.println("Ocurrio un error : "+e.getMessage());
            }
          }

          generarHistorial.registroDeHistorial(listaDeMonedas);

      }catch (RuntimeException e){
          System.out.println("Ocurrio un error: "+e.getMessage());
      }



    }

}
