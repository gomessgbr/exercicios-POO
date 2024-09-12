package org.example.Empresa;

public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularBonus(){
        return 0;
    }

    public String trabalhar(){
        return "";
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
        System.out.println("Bônus: " + calcularBonus());
    }
}
