/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercio4;

/**
 *
 * @author SFDK
 */
import java.util.Scanner;
public class Temperatura {
    private int grados;
    
  public Temperatura(int grados){
    this.grados=grados;
    } 
    public Temperatura(){}

 public int getTemperatura(){
    return grados;
 }

 public void setTemperatura(int grados){
 this.grados=grados;
 }

 public void Mostrar(){
 double convertir;
 Scanner in = new Scanner(System.in);
 System.out.print("Ingrese los grados  centigrados a transformar a Farengeint: ");
 grados=in.nextInt();
 convertir=32+(9*grados/5);
 System.out.print("Los grados a Farengeint son: " + convertir );
 System.out.println("");
 }
}
