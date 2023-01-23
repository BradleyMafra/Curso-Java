package Lista02;
import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // Escreva um algoritmo para ler um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar, e se é positivo ou negativo.
        
        System.out.println("Informe um número inteiro: ");
        int numero = leitor.nextInt();
        leitor.close();

        if (numero % 2 == 0 && numero >= 0) 
            System.out.println("O número informado é PAR e POSITIVO: " + numero);
        else if (numero % 2 != 0 && numero < 0 )
            System.out.println("O numero é IMPAR E NEGATIVO: " + numero);
            else if (numero % 2 != 0 && numero >= 0) 
                System.out.println("O número informado é IMPAR e POSITIVO: " + numero);
                else 
                System.out.println("O número informado é PAR e NEGATIVO");
    }
}
