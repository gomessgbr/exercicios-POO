package org.example.EmpresaV2;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Funcionario> funcionarios = new ArrayList<>();
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
    public double calcularFolhaPagamento() {
        double total = 0;
        for (Funcionario funcionario : funcionarios) {
            total += funcionario.calcularSalario();
        }
        return total;
    }
    public void exibirFolhaPagamento() {
        for (Funcionario funcionario : funcionarios) {
            funcionario.exibirDados();
            System.out.println();
        }
    }
    public void promoverFuncionario(int index, Funcionario novoCargo) {
        if (index >= 0 && index < funcionarios.size()) {
            funcionarios.set(index, novoCargo);
        }
    }
}
