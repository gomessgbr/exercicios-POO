package org.example.Loja;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Coletando informações do produto via terminal
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.print("Digite a quantidade em estoque: ");
        int quantidadeEstoque = scanner.nextInt();

        // Criando o produto
        Produto produto = new Produto(nome, preco, quantidadeEstoque);
        produto.exibirProduto();

        // Perguntar se o usuário quer aplicar desconto
        System.out.print("\nDeseja aplicar um desconto? (sim/não): ");
        scanner.nextLine(); // Consumir a quebra de linha restante
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("sim")) {
            System.out.print("Digite a porcentagem de desconto: ");
            double porcentagemDesconto = scanner.nextDouble();

            // Aplicar o desconto, se for válido
            produto.aplicarDesconto(porcentagemDesconto);
            produto.exibirProduto();
        } else {
            System.out.println("Nenhum desconto foi aplicado.");
        }

        scanner.close();

    }

}
