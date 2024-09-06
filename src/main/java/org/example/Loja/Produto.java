package org.example.Loja;

public class Produto {
    private String nome;
    private Double preco;
    private int qtdEstoque;

    public Produto(String nome, Double preco, int qtdEstoque){
        this.nome = nome;
        setPreco(preco);
        setQtdEstoque(qtdEstoque);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("O preço não pode ser negativo.");
        }
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        if (qtdEstoque >= 0) {
            this.qtdEstoque = qtdEstoque;
        } else {
            System.out.println("A quantidade em estoque não pode ser negativa.");
        }
    }

    public void aplicarDesconto(double porcentagem) {
        if (porcentagem < 0 || porcentagem > 50) {
            System.out.println("Erro: A porcentagem de desconto deve estar entre 0% e 50%.");
        } else {
            this.preco -= this.preco * (porcentagem / 100);
            System.out.println("Desconto aplicado com sucesso!");
        }
    }


    public void exibirProduto() {
        System.out.println("\n=== Informações do Produto ===");
        System.out.println("Nome do Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em Estoque: " + qtdEstoque);
    }
}
