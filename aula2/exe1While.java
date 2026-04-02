package aula2;

import java.util.Scanner;

public class exe1While {
    public static void main(String[] args) {
        Scanner ln = new Scanner(System.in);
        
        System.out.println("Digite uma nota entre 0 ne 10: ");
        double nota = ln.nextDouble();
        
        while (nota < 0 || nota > 10) { // significa ou 
            System.out.println("valores invalidos");
            
            System.out.println("Digite uma nota entre 0 ne 10: ");
            nota = ln.nextDouble(); // tirar o double pq ja determinou a variavel da primeira vez
        }

    }
}
