package org.example.EmpresaV2;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase + calcularBonus();
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.10;
    }

}
