
//Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma


package ejercio_1;


import java.util.Scanner;
public class Ejercio_1 {
   
   
    
    public static void main(String[] args) {
    int num1;
    int num2;  
    int suma;
    Scanner operacion = new Scanner(System.in);
    
    System.out.print("Ingrese el primer numero: ");
    num1 = operacion.nextInt();
    System.out.print("Ingrese el segundo numero: ");
    num2=operacion.nextInt();
    
    suma=num1+num2;
    
    System.out.print("La suma de los numeros ingresados es: " + suma);
    
    System.out.println("");
    
    
    }
}