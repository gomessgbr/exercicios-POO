package org.example.Empresa;

public class Gerente extends Funcionario{

    public Gerente(String nome, Double salario) {
        super(nome, salario);
    }

    public double calcularBonus(){
        return salario * 0.20;
    }

    @Override
    public void trabalhar(){
        System.out.println(nome + " está gerenciando");
    }
}
