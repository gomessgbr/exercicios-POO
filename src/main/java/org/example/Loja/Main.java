package org.example.Loja;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.print("Digite a quantidade em estoque: ");
        int quantidadeEstoque = scanner.nextInt();


        Produto produto = new Produto(nome, preco, quantidadeEstoque);


        exibirProduto(produto);


        System.out.print("\nDeseja aplicar um desconto? (sim/não): ");
        scanner.nextLine();
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("sim")) {
            System.out.print("Digite a porcentagem de desconto: ");
            double porcentagemDesconto = scanner.nextDouble();


            produto.aplicarDesconto(porcentagemDesconto);


            exibirProduto(produto);
        } else {
            System.out.println("Nenhum desconto foi aplicado.");
        }

        scanner.close();

    }


    public static void exibirProduto(Produto produto) {
        System.out.println("\n=== Informações do Produto ===");
        System.out.println("Nome do Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Quantidade em Estoque: " + produto.getQtdEstoque());
    }

}
