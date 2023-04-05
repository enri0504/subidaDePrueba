/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frase;

/**
 *
 * @author SFDK
 */
import java.util.Scanner;
public class Frase_mayuscula {
    private String frase;

    public Frase_mayuscula(String frase){
    this.frase=frase;
    }
    public Frase_mayuscula(){}
    
    public String getFrase_mayuscula(){
        return frase;
    }
    
    public void setFrase_mayuscula(String frase){
        this.frase=frase;
    
    }
    
    public void Mostrar(){
        String frase1, frase2;
        Scanner in =new Scanner(System.in);
        System.out.println("Ingrese una frase");
        frase=in.nextLine();
        frase1= frase.toUpperCase();
        frase2=frase.toLowerCase();
        System.out.println("La frase ingresada en mayusculas es: " + frase1);
         System.out.println("La frase ingresada en minuscula es: " + frase2);
        
    }

   
    
}