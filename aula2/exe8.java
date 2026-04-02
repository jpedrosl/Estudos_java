package aula2;

import java.util.Scanner;

public class exe8 {
    public static void main(String[] args) {
        Scanner ln = new Scanner(System.in);
        int numero, soma = 0;
        double media;

        for( int i=1; i<=5; i++){
            System.out.println("digite um numero: ");
            numero = ln.nextInt();
            soma = soma + numero;
    
        }
        media = soma/5;
        System.out.println(soma);
        System.out.println(media);

    }

}    
