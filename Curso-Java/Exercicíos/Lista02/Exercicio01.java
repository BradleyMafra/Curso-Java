package Lista02;
import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // Escreva um algoritmo para ler 2 valores A e B e escrever seus valores seguidos da mensagem: "são múltiplos" ou "não são múltiplos".

        System.out.println("Informe o valor A:");
        int valorA = leitor.nextInt();

        System.out.println("Informe o valor B");
        int valorB = leitor.nextInt();
        leitor.close();

        if(valorA % valorB == 0)
            System.out.println("O numero é multiplo: ");
        else
            System.out.println("O numero não é multiplo: ");
    }    
}
