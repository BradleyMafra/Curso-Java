package Lista01;
import java.util.Scanner;
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // O custo ao consumidor de um carro novo é a soma do custo de fábrica com o percentual do distribuidor e dos impostos (aplicados ao custo de fábrica).
        // O percentual do distribuidor é de 28% e os impostos de 45%. Escreva um algoritmo para ler o custo de fábrica de um carro e escreva o custo ao consumidor.

        float imposto = 45;
        float impostoDistribuidor = 28;

        System.out.println("Informe o custo de fábrica do carro: ");
        float valorFabrica = leitor.nextFloat();
        leitor.close();

        imposto = (valorFabrica*imposto)/100;
        imposto += valorFabrica;

        impostoDistribuidor = (valorFabrica*impostoDistribuidor)/100;
        impostoDistribuidor += valorFabrica;

        float valorFinal = impostoDistribuidor + imposto;
        System.out.println("Valor final do carro com os impostos aplicados é de: "+valorFinal);
    }
}
