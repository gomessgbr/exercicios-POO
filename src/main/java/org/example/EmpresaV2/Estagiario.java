package org.example.EmpresaV2;

public class Estagiario extends Funcionario{
    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }

    @Override
    public double calcularBonus() {
        return 0;
    }
}
