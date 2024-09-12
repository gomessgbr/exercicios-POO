package org.example.Pagamentos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       FormaPagamento cartaoCredito = new CartaoCredito("1234567812345678", "04/25", "123");
        FormaPagamento boleto = new Boleto("12345678901234567890123456789012345678901234567");
        FormaPagamento pix = new Pix("chavepix123");

        List<FormaPagamento> pagamentos = new ArrayList<>();
        pagamentos.add(cartaoCredito);
        pagamentos.add(boleto);
        pagamentos.add(pix);

        for (FormaPagamento pagamento : pagamentos) {
            pagamento.processarPagamento(150.00);
            System.out.println();
        }
    }
}
