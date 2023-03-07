/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej6;

import Entidad.Cafetera;
import Servicio.ServicioCafetera;
import java.util.Scanner;

/**
 *
 * @author 54343
 */
public class POOEj6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int opcion;

        ServicioCafetera ser = new ServicioCafetera();

        Cafetera C1 = ser.crearCafetera();

        do {

            System.out.println("- Menu de Usuario -");
            System.out.println("1 - Llenar Cafetera");
            System.out.println("2 - Servir Taza");
            System.out.println("3 - Vaciar Cafetera");
            System.out.println("4 - Agregar Café");
            System.out.println("5 - Salir");

            System.out.println("Elija una opción");
            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    ser.llenarCafetera(C1);
                    break;
                case 2:
                    ser.servirTaza(C1);
                    break;
                case 3:
                    ser.vaciarCafetera(C1);
                    break;
                case 4:
                    ser.agregarCafe(C1);
                    break;
                case 5:
                    System.out.println("Sistema cerrado");
                default: 
                    System.out.println("Opción Erronea");
                    break;
            }

        } while (opcion != 5);
    }
    
}
