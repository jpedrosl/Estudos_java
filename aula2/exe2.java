package aula2;

import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
        
        Scanner ln = new Scanner(System.in);

        System.out.println("digite seu nome: ");
        String nome = ln.nextLine();

        System.out.println("digite sua senha: ");
        String senha = ln.nextLine();

        while(nome.equals(senha)){ //equals é para string e == é para numerico
            System.out.println("seu nome nao pode ser igual a sua senha ");
            System.out.println("digite novamente o seu nome ");
            nome = ln.nextLine();
            System.out.println("digite sua senha");
            senha = ln.nextLine();
            
        } 
        
        
    }
}
