package Lista01;
import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // Escreva um algoritmo para ler 3 notas de um aluno e calcular a sua média final (média ponderada; o peso das notas é: 2, 3 e 5, respectivamente).

        System.out.println("Informe a 1° nota: ");
        float nota01 = leitor.nextFloat();
        System.out.println("Informe a 2° nota: ");
        float nota02 = leitor.nextFloat();
        System.out.println("Informe a 3° nota: ");
        float nota03 = leitor.nextFloat();
        leitor.close();

        float mediaPonderada =  (float)(nota01 * 0.2f + nota02 * 0.3f + nota03 * 0.5f);
    
        System.out.println("1° nota:"+nota01);
        System.out.println("2° nota:"+nota02);
        System.out.println("3° nota:"+nota03);
        System.out.println("A sua média ponderada é: "+ mediaPonderada);
    }
}
