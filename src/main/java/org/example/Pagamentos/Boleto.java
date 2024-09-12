package org.example.Pagamentos;

public class Boleto extends FormaPagamento {
    private String codigoBarras;

    public Boleto(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Pagamento de R$" + valor + " processado com sucesso via boleto.");
        } else {
            System.out.println("Falha ao processar o pagamento via boleto.");
        }
    }

    @Override
    public boolean validarPagamento() {
        return codigoBarras.length() == 47;
    }
}
