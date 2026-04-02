//Faça um programa que peça uma nota, entre zero e dez. 
//Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
package aula2;

import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
        Scanner ln = new Scanner(System.in);

        for (int i=1; i<=10; i++){
            System.out.println("Digite uma nota entre 0 e 10: ");
            double nota = ln.nextDouble();

            if (nota < 0 || nota > 10){
                System.out.println("Valor inválido, tente novamente.");
                i--; //decrementa o contador para repetir a iteração
            } else {
                System.out.println("Nota válida: " + nota);
            }
        } 

    }
}