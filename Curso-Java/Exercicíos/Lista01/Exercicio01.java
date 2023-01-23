package Lista01;
import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        // Escreva um algoritmo para ler as dimensões de um retângulo (base e altura) e calcular a sua área.
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a base do retângulo: ");
        int base = leitor.nextInt();
        System.out.println("Informe a altura do retângulo: ");
        int altura = leitor.nextInt();
        leitor.close();

        int area = base*altura;
        System.err.println("A base informada foi: " + base +"\n A altura informada foi: "+altura+ "\n A área do retângulo é de: " + area);
    }    
}
