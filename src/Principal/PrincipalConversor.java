package Principal;

import Conexion.ConsultaMoneda;

public class PrincipalConversor {
    public static void main(String[] args) {
        ConsultaMoneda consultaMoneda = new ConsultaMoneda();
        String message = consultaMoneda.consultaDeMoneda();
        System.out.println(message);
    }
}
