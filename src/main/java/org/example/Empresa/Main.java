package org.example.Empresa;

public class Main {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Gabriel", 20000.0);
        Funcionario desenvolvedor = new Desenvolvedor("Gomes", 15000.0);

        gerente.exibirDados();
        System.out.println();
        desenvolvedor.exibirDados();
    }
}
