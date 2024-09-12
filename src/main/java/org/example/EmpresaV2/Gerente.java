package org.example.EmpresaV2;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase + calcularBonus();
    }
    @Override
    public double calcularBonus() {
        return salarioBase * 0.20;
    }
}
