package ProgramaPernas;

import java.util.Scanner;

public class ProgramaPernas {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Quantas pernas");
        int perna = tec.nextInt();
        System.out.println("Isso é um(a)");
        String tipo;
        switch (perna) {
        case 1:
            tipo = "Saci";
            break;
        case 2:
            tipo = "Bípede";
            break;
        case 3:
            tipo ="Tripé";
            break;
        case 4: 
            tipo = "Quadrúpede";
            break;
        case 5:
            tipo = "Aranha";
            break;      
        default:
            tipo = "ET";
            break;    
        } 
        System.out.println(tipo);
    } 
}


         

    
