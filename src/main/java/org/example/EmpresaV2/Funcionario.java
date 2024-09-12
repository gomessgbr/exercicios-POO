package org.example.EmpresaV2;

public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;


    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }


    public abstract double calcularSalario();


    public abstract double calcularBonus();


    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$" + calcularSalario());
        System.out.println("Bônus: R$" + calcularBonus());
    }
}
