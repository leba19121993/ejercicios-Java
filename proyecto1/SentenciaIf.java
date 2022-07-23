package proyecto1;
import java.util.Scanner;
public class SentenciaIf {
    public static void main (String[] args){
   int edad;
   Scanner sc = new Scanner(System.in );
        System.out.println("Introduce tu edad");
        edad = sc.nextInt();
        if (edad >=18){
            System.out.println("Como tu edad es: " + edad + " si puedes votar");
            System.out.println("Por lo tanto eres mayor de edad aqui en Mexico");
        }
}    
}

