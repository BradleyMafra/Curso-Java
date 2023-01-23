package Lista02;
import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Produto		    Código  Preço");
        System.out.println("Cachorro-quente	    100     1,20"); 
        System.out.println("Bauru simples 	    101     1,30");
        System.out.println("Bauru com ovo 	    102     1,50");
        System.out.println("Hambúrguer 	    103     1,20");
        System.out.println("Misto Quente 	    104     1,30");
        System.out.println("Refrigerante 	    105     1,00 ");

        System.out.println("\nInforme o código do item: ");
        int id = leitor.nextInt();
        System.out.println("Informe a quantidade: ");
        int quantidade = leitor.nextInt();
        leitor.close();

        switch (id) {
            case 100:
                double soma = quantidade * 1.20;
                System.out.println("Pedido: Cachorro-quente" + "\n Quantidade: " + quantidade + "\n Valor do pedido: " + soma);
                break;

            case 101:
                soma = quantidade * 1.30;
                System.out.println("Valor do pedido: " + soma);
                break;

            case 102:
                soma = quantidade * 1.50;
                System.out.println("Valor do pedido: " + soma);
                break;

            case 103:
                soma = quantidade * 1.20;
                System.out.println("Valor do pedido: " + soma);
                break;

            case 104:
                soma = quantidade * 1.30;
                System.out.println("Valor do pedido: " + soma);
                break;

            case 105:
                soma = quantidade * 1.00;
                System.out.println("Valor do pedido: " + soma);
                break;
        }
    }
}