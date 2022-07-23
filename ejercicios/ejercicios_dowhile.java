package ejercicios;
import java.util.Scanner;
public class ejercicios_dowhile {
    public static void main (String[] args) {
        int opcion;
        String nombre;
        Scanner sc = new Scanner (System.in);
        do {
            System.out.println("Introduce tu nombre");
            nombre = sc.next();
            System.out.println(nombre);
            System.out.println("Deseas repetir el programa    SI(1)   NO(0)");
            opcion = sc.nextInt();
            
        }while ( opcion == 1 );
    }
     
}
        
        
