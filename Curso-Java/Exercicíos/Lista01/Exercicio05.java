package Lista01;
import java.util.Scanner;
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // Escreva um algoritmo para ler a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias (considerar o ano com 365 dias e o mês com 30 dias).

        System.out.println("Informe sua idade em anos: ");
        int anos = leitor.nextInt();
        System.out.println("Informe sua idade em meses: ");
        int meses = leitor.nextInt();
        System.out.println("Informe sua idade em dias: ");
        int dias = leitor.nextInt();
        leitor.close();

        anos = anos*365;
        meses = meses*30;
        int idadeEmDias = anos+meses+dias ;
        System.out.println("Sua idade em dias é: "+idadeEmDias);
    }
}