package Lista02;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // Escreva um algoritmo para ler o código de um aluno e suas três notas.
        // Calcule a média ponderada do aluno, considerando que o peso para a maior nota
        // seja 4 e para as duas restantes, 3.
        // Mostre o código do aluno, suas três notas, a média calculada e uma mensagem
        // "APROVADO" se a média for maior ou igual a 7 e "REPROVADO" se a média for
        // menor que 7.
        System.out.println("Informe o código do aluno e 3 sua notas: ");
        int codigo = leitor.nextInt();
        int nota1 = leitor.nextInt();
        int nota2 = leitor.nextInt();
        int nota3 = leitor.nextInt();
        int media = 0;
        leitor.close();

        if (nota1 > nota2 && nota1 > nota3) {
            media = (nota1 * 4 + nota2 * 3 + nota3 * 3) / 10;
            if (media >= 7) {
                System.out.println("Aprovado!");
                System.out.print("Código: " + codigo + "\n 1° Nota: " + nota1 + "\n 2° Nota: " + nota2 + "\n 3° Nota: " + nota3+ "\n Média: " + media);
            }
        } else {
            if (nota2 > nota3) {
                media = (nota1 * 4 + nota2 * 3 + nota3 * 3) / 10;
                if (media >= 7) {
                    System.out.println("Aprovado!");
                    System.out.print("Código: " + codigo + "\n 1° Nota: " + nota1 + "\n 2° Nota: " + nota2 + "\n 3° Nota: " + nota3+ "\n Média: " + media);
                }
            } else {
                if (nota3 > nota2 && nota3 > nota1) {
                    media = (nota1 * 4 + nota2 * 3 + nota3 * 3) / 10;
                    if (media >= 7) {
                        System.out.println("Aprovado!");
                        System.out.print("Código: " + codigo + "\n 1° Nota: " + nota1 + "\n 2° Nota: " + nota2 + "\n 3° Nota: " + nota3+ "\n Média: " + media);
                    } else 
                        System.out.println("Reprovado!");
                }
            }
        }
    }
}
