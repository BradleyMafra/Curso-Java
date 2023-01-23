package Lista02;
import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // Escreva um algoritmo para ler 3 números inteiros e mostrar o maior deles.

        System.out.println("Informe o 1°número: ");
        int numero01 = leitor.nextInt();
        System.out.println("Informe o 2°número: ");
        int numero02 = leitor.nextInt();
        System.out.println("Informe o 3°número: ");
        int numero03 = leitor.nextInt();
        leitor.close();

        if (numero01 > numero02 && numero01 > numero03)
            System.out.println("O maior número é o: " + numero01);
        else if (numero02 > numero03) 
            System.out.println("O maior número é o: " + numero02);
        else
            System.out.println("O maior número é o: " + numero03);
    }
}
