package Lista01;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // Escreva um algoritmo para ler 3 notas de um aluno e calcular a sua média final (média aritmética).
        
        System.out.println("Informe a 1°nota do aluno:");
        float nota01 = leitor.nextFloat();

        System.out.println("Informe a 2°nota do aluno:");
        float nota02 = leitor.nextFloat();

        System.out.println("Informe a 3°nota do aluno:");
        float nota03 = leitor.nextFloat();
        leitor.close();

        float media = (nota01 + nota02 + nota03)/3;

        System.out.println("1°nota informada: "+nota01);
        System.out.println("2°nota informada: "+nota02);
        System.out.println("3°nota informada: "+nota03);
        System.out.println("Média final do aluno: "+media);
    }
}
