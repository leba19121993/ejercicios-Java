package proyecto1;
import java.util.Scanner;
public class PrimerProyecto {
    public static void main (String[] args){
    String nombre;
    int edad;
    Scanner sc = new Scanner (System.in);
    System.out.println("Introduce tu nombre");
    nombre = sc.next();
    System.out.println("Introduce tu edad");
    edad = sc.nextInt();
    System.out.println("Tu nombre es: "+nombre + " y tu edad es " + edad +" ");
}    
}
