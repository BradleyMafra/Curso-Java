package Lista01;
import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // Uma revendedora de carros usados paga a seus funcionários um salário fixo por mês, mais uma comissão em reais para cada carro vendido 
        // E mais 5% do valor das vendas por ele efetuadas.
        // Escreva um algoritmo para ler o número de carros vendidos por um vendedor, o valor total de suas vendas, o salário fixo e o valor que ele recebe por carro vendido.
        // Calcule e escreva o salário final do vendedor.


        System.out.println("Informe o salário fixo do funcionário: ");
        float salarioFixo = leitor.nextFloat();
        System.out.println("Informe a comissão em reais por carro vendido: ");
        float comissaCarroVendido = leitor.nextFloat();
        System.out.println("Informe o total de carros vendidos: ");
        float carrosVendidos = leitor.nextFloat();
        System.out.println("Informe o valor total de sua vendas: ");
        float totalVendas = leitor.nextFloat();
        leitor.close();

        for(int i = 0; i < carrosVendidos; i++){
            salarioFixo += comissaCarroVendido;
        }
        totalVendas = (totalVendas/100)*salarioFixo;
        salarioFixo = totalVendas;

        System.out.println("O seu salário fixo por mês com as comissões ficou: "+salarioFixo);
    }
}