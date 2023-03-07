/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author 54343
 */
public class ServicioCafetera {
     Scanner leer = new Scanner(System.in);
    
    
    public Cafetera crearCafetera(){
         Cafetera C1 = new Cafetera();
         
        System.out.println("Ingrese la capacidad máxima de la cafetera");
            C1.setCapacidadMaxima(leer.nextInt());
            System.out.println("");
        
        return C1;
    }
    
    //? Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
    public void llenarCafetera(Cafetera C1){
        
       C1.setCantidadActual(C1.getCapacidadMaxima());  
        System.out.println("Se lleno la cafetera");
        System.out.println("");
       
    }
    
    /*
    ? Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
    */
    
    public void servirTaza(Cafetera C1){
        
        System.out.println("Ingrese el tamaño de la taza");
        int taza = leer.nextInt();
        
        if (taza <= C1.getCantidadActual()){
            
            System.out.println("Taza Llena !!");
            C1.setCantidadActual(C1.getCantidadActual() - taza);
            System.out.println("");
        }else{
            
            System.out.println("No se lleno la taza, quedo en: " + C1.getCantidadActual());
            C1.setCantidadActual(0);
            System.out.println("");
        }
    }
    
    
    /*
    ? Método vaciarCafetera(): pone la cantidad de café actual en cero.

    */
    public void vaciarCafetera(Cafetera C1){
        C1.setCantidadActual(0);
        
        System.out.println("La cafetera esta vacia");
        System.out.println("");
    }
    
    
    /*
    ? Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
    */
    
    public void agregarCafe(Cafetera C1){
        
        System.out.println("Ingrese la cantidad de cafe para agregar");
        int agregar = leer.nextInt();
        
        if((C1.getCantidadActual() + agregar) > C1.getCapacidadMaxima()){
            
            System.out.println("Excede la capacidad, la cafetera esta llena!!");
            C1.setCantidadActual(C1.getCapacidadMaxima());
            System.out.println("");
        }else{
            C1.setCantidadActual(C1.getCantidadActual() + agregar);
            System.out.println("La cafetera quedo en " + C1.getCantidadActual());
            System.out.println("");
        }
    }

    
}
