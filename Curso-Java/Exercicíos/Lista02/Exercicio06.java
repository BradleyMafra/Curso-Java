package Lista02;
import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // Escreva um algoritmo para ler as medidas dos lados de um triângulo e escrever se ele é Equilátero, Isósceles ou Escaleno. Sendo que:
        // Triângulo Equilátero: possui os 3 lados iguais;
	    // Triângulo Isósceles: possui 2 lados iguais;
	    // Triângulo Escaleno: possui 3 lados diferentes.

        System.out.println("Informe os 3 tamanhos de um triângulo: ");
        int tamanho01 = leitor.nextInt();
        int tamanho02 = leitor.nextInt();
        int tamanho03 = leitor.nextInt();
        leitor.close();

        if(tamanho01 == tamanho02 && tamanho01 == tamanho03)
            System.out.println("Triângulo Equilátero");
            else if(tamanho01 == tamanho02 || tamanho01 == tamanho03 || tamanho03 == tamanho02)
                System.out.println("Triângulo Isósceles");
                else 
                    System.out.println("Triângulo Escaleno");
    }
}
