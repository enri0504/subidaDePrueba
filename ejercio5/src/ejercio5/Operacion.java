/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercio5;

import java.util.Scanner;
public class Operacion {
    private int num;

public Operacion(int num){
    this.num=num;
}

public  Operacion(){}

public int getOperacion(){
    return num;
}

public void  setOperacion(int num){
    this.num=num;
}
public void Mostrar(){
    double raiz;
Scanner In= new Scanner(System.in);
System.out.println("Ingrese un numero");
num= In.nextInt();
raiz=Math.sqrt(num);
System.out.println("El doble del numero ingresado es: " + 2*num);
System.out.println("El triple del numero ingreasdo es: " + 3*num);
System.out.println("La raiz cuadrada del numero ingresado es:"+ raiz);
}
}
