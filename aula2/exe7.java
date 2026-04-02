//mostre qual é o maior numero entre os 5 
package aula2;

import java.util.Scanner;

public class exe7 {
    public static void main(String[] args) {
        Scanner ln = new Scanner(System.in);
        int i = 1;
        int numero = 0;
        int maior = 0;
        
        while(i<=5) {
            System.out.println("Digite um numero: ");
            numero = ln.nextInt();
            if (numero > maior) {
            maior = numero;
            i++;
            } 
        }
        System.out.println("O maior numero é: " + maior);
    }
}
