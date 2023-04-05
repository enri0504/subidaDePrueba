//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
package ejercio2;

import java.util.Scanner;
public class Ejercio2 {

     public static void main(String[] args){ 
     String nombre;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre= in.next();
        System.out.println("El nombre del usuario es: "+ nombre);
    }
    
}
