package proyecto1;
import java.util.Scanner;
public class Sentencia_IfElse {
    public static void main (String[] args){
   int edad;
   Scanner sc = new Scanner(System.in );
        System.out.println("Introduce tu edad");
        edad = sc.nextInt();
        if (edad >=18){
            System.out.println("Como tu edad es: " + edad + " si puedes votar");
            System.out.println("Por lo tanto eres mayor de edad aqui en Mexico");
        }
        else {
            System.out.println("Tu edad es: " + edad + " y no es mayor o igual a 18");
            System.out.println(" Por lo tanto no puedes votar");
        }
}    
}
