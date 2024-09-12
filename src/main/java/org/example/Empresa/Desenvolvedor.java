package org.example.Empresa;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, Double salario) {
        super(nome, salario);
    }

    public double calcularBonus(){
        return salario * 0.10;
    }
}
