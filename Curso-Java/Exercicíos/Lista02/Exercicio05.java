package Lista02;
import java.util.Scanner;
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // Escreva um algoritmo para ler três valores A, B, C e verificar se eles formam ou não um triângulo (se a > b + c não formam triângulo algum).
        System.out.println("Informe três valores A, B e C na sequência: ");
        int valorA = leitor.nextInt();
        System.out.println("");
        int valorB = leitor.nextInt();
        System.out.println("");
        int valorC = leitor.nextInt();
        leitor.close();

        int calculo = valorB + valorC; // faciltar a visibilidade
        if(valorA > calculo)
            System.out.println("Os números informados não formam um triangulo");
            else
            System.out.println("Os números informados formam um triângulo");
    }
}
