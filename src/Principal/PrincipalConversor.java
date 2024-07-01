package Principal;

import Calculos.CalculoConversion;
import Conexion.ConsultaMoneda;
import Modelos.Moneda;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PrincipalConversor {
    public static void main(String[] args) {

        Scanner monedaEntrante = new Scanner(System.in);
        Scanner monedaSaliente = new Scanner(System.in);
        Scanner cantidadAConvertirScanner = new Scanner(System.in);


      try {
          System.out.println("Introduce la moneda a convertir (por ejemplo, USD): ");
          String monedaAConvertir = monedaEntrante.nextLine();

          System.out.println("Introduce la moneda de destino (por ejemplo, ALL): ");
          String monedaDeDestino = monedaSaliente.nextLine();

          System.out.println("Introduzca la cantidad a convertir");
          double cantidadAConvertir = cantidadAConvertirScanner.nextDouble();

          CalculoConversion calculoConversion = new CalculoConversion();

          String res = calculoConversion.ConvertirMoneda(monedaAConvertir,monedaDeDestino,cantidadAConvertir);

          System.out.println("Conversion: " +res);
      }catch (RuntimeException e){
          System.out.println("Ocurrio un error: "+e.getMessage());
      }



    }

}
