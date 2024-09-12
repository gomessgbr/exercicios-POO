package org.example.Pagamentos;

public class Pix extends FormaPagamento {
    private String chavePix;


    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }


    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Pagamento de R$" + valor + " processado com sucesso via Pix.");
        } else {
            System.out.println("Falha ao processar o pagamento via Pix.");
        }
    }


    @Override
    public boolean validarPagamento() {

        return chavePix.length() >= 10;
    }
}
