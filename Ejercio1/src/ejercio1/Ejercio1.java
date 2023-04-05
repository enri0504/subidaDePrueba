
package ejercio1;
import java.util.Scanner;
        

public class Ejercio1 {

  private String nombre;
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese su nombre");
        nombre=leer.next();
        System.out.println("Hola mundo soy " + nombre );
    }
    
}
