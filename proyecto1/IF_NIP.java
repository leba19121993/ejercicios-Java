package proyecto1;
import java.util.Scanner;
public class IF_NIP {
    public static void main (String[] args){
        int nip;
        Scanner dato =  new Scanner (System.in);
        System.out.println(" Introduce tu NIP");
        nip = dato.nextInt();
        if (nip == 1234){
            System.out.println("Tu nip es correcto");
            
        }
        else
            System.out.println(" NIP incorrecto");
    }
    
}
