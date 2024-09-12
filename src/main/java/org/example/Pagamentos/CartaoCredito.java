package org.example.Pagamentos;

public class CartaoCredito extends FormaPagamento{
    private String numeroCartao;
    private String validade;
    private String cvv;

    public CartaoCredito(String numerCartao, String validade, String cvv){
        this.numeroCartao = numerCartao;
        this.validade = validade;
        this.cvv = cvv;
    }
    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Pagamento de R$" + valor + " processado com sucesso no cartão de crédito.");
        } else {
            System.out.println("Falha ao processar o pagamento no cartão de crédito.");
        }

    }

    @Override
    public boolean validarPagamento() {
        return numeroCartao.length() == 16 && cvv.length() == 3;
    }
}
