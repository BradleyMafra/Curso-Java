package Lista02;
import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // Escreva um algoritmo para ler a hora de início de um jogo e a hora do final do jogo (considerando apenas horas inteiras) 
        // Calcular a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.

        System.out.println("Informe a hora que o jogo começou: ");
        int horaInicio = leitor.nextInt();
        System.out.println("Informe a hora que o jogo acabou: ");
        int horaFinal = leitor.nextInt();
        leitor.close();

        int calculo = 24 - ( 24 + horaInicio - horaFinal) % 24;  

        if(calculo == 24)
            System.out.println("O jogo durou 24h");
            else
                System.out.println("A duração do jogo foi de: " + calculo);

    }
}
