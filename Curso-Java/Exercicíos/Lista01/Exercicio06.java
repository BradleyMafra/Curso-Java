package Lista01;
import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // Escreva um algoritmo para ler a temperatura em Fahrenheit e calcular a temperatura correspondente em Celsius.
        
        System.out.println("Informe a temperatura: ");
        float tempF = leitor.nextFloat();
        leitor.close();

        float tempC =(float) tempF-32.0f;

        System.err.println("A temperatura em Celsius é: "+tempC);
        
    }
}
