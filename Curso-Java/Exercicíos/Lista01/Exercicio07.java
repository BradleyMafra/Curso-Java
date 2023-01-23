package Lista01;
import java.util.Scanner;
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // Escreva um algoritmo para ler o salário atual de um funcionário e o percentual de reajuste e calcular o seu novo salário.

        System.out.println("Informe o salário atual do funcionário: ");
        float salario = leitor.nextFloat();
        System.out.println("Informe o percentual para ajustar o salário: ");
        float reajuste = leitor.nextFloat();
        leitor.close();

        // Conta para obter o salário já com o reajuste da porcentagem informada.
        float conta = salario * reajuste / 100;
        conta += salario;

        System.out.println("O seu novo salário com o reajuste de "+reajuste+"%"+" ficou: "+conta);

    }
}
