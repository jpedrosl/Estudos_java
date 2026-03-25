import java.util.Scanner;
//import java.util importa bibliotecas util
public class aula01 {
    public static void main(String[] args) {
//declaracao das variaveis

        String nome; //String sempre com S maiusculo(passar textos para uma variavel)
        int idade;  //inteiro, usado para números inteiros
        double peso;  //ou double (mais preciso) quando precisar de mais casas decimais. ambos se usam para valor real
        boolean ativo = false; //booleano, só tem 2 valores: true ou false. usado para dizer se algo é verdadeiro ou falso
        

//entrada de dados        
        Scanner ler = new Scanner(System.in); //Scanner é uma classe usada para ler dados do usuário, precisa importar a biblioteca java.util.Scanner. vc escolhe a variavel depois do primeiro Scanner (ler) e atribui a nova instancia da classe Scanner (new Scanner(System.in)) para ler do teclado (System.in)
        
        System.out.println("digite o seu nome: ");
        nome = ler.nextLine(); //nextLine() é um método da classe Scanner que lê uma linha de texto do usuário e retorna como uma String. aqui estamos atribuindo o valor lido para a variavel nome
        
        System.out.println("digite a sua idade: ");
        idade = ler.nextInt();
        
        System.out.println("digite o seu peso: ");
        peso = ler.nextDouble();

        System.out.println("digite 1 para ativar o cadastro: ");
        int cadastro = ler.nextInt(); //ler o valor inteiro para cadastro
        if (cadastro==1){
            ativo = true; //se o valor de cadastro for igual a 1, então ativo é verdadeiro
        }
            
            
        

        
        
//saida de dados
        System.out.println(nome);
        System.out.println(idade); //system.out.println para imprimir a alguma coisa no terminal (sout)
        System.out.println(peso);
        System.out.println(ativo);
        System.out.println("seu cadastro esta ativo!");
    }
}

