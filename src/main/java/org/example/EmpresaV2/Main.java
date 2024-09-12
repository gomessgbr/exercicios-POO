package org.example.EmpresaV2;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Funcionario gerente = new Gerente("Gabs",1000);
        Funcionario desenvolvedor = new Desenvolvedor("Bob", 8000);
        Funcionario estagiario = new Estagiario("Charlie", 2000);

        empresa.adicionarFuncionario(gerente);
        empresa.adicionarFuncionario(desenvolvedor);
        empresa.adicionarFuncionario(estagiario);

        System.out.println("Folha de pagamento inicial:");
        empresa.exibirFolhaPagamento();

        System.out.println("Total da folha de pagamento: R$" + empresa.calcularFolhaPagamento());
        empresa.promoverFuncionario(2, new Desenvolvedor("Charlie", 5000));

        System.out.println("\nFolha de pagamento após promoção:");
        empresa.exibirFolhaPagamento();

        System.out.println("Total da folha de pagamento após promoção: R$" + empresa.calcularFolhaPagamento());
    }
}
