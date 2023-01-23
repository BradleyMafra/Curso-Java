package Lista01;
import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // Escreva um algoritmo para ler a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias (considerar o ano com 365 dias e o mês com 30 dias).

        System.out.println("Informe sua idade em dias: ");
        int dias = leitor.nextInt();
        leitor.close();

        int mes = dias / 30;
        int anos = dias / 365;

        System.out.println("Sua idade expressa em Anos Meses e Dias fica: ");
        System.out.println("Anos: "+anos);
        System.out.println("Meses: "+mes);
        System.out.println("Dias: "+dias);
    }
}
