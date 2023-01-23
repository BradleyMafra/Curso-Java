package Lista01;
import java.util.Scanner;
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // Escreva um algoritmo para ler o número total de eleitores de um  município, o número de votos brancos, nulos e válidos.
        // Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.

        System.out.println("Informe o total de eleitores: ");
        int eleitores = leitor.nextInt();
        System.out.println("Informe o total de votos em Branco: ");
        int votosBrancos = leitor.nextInt();
        System.out.println("Informe o total de votos Nulos: ");
        int votosNulos = leitor.nextInt();
        System.out.println("Informe o total de votos válidos: ");
        int votosValidos = leitor.nextInt();
        leitor.close();

        int totalBrancos = eleitores*votosBrancos/100;
        int totalNulos = eleitores*votosNulos/100;

        System.out.println("Percentual de votos Brancos: "+totalBrancos+"%");
        System.out.println("Percentual de votos Nulos: "+totalNulos+"%");
        System.out.println("Percentual de votos Validos: "+votosValidos+"%");

    }
}
