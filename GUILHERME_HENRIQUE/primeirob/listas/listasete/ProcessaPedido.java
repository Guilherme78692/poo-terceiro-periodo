package GUILHERME_HENRIQUE.primeirob.listas.listasete;

import java.util.List;
import java.util.Date;

public class ProcessaPedido {

    public Pedido processar(int id, Date dataCriacao, Date dataVencimentoReserva, Cliente cliente, Vendedor vendedor, Loja loja, List<Item> itens) {
        return new Pedido(id, dataCriacao, dataVencimentoReserva, cliente, vendedor, loja, itens);
    }

    public void confirmarPagamento(Pedido pedido, Date dataAtual) {
        if (verificarValidadeReserva(pedido, dataAtual)) {
            System.out.println("Pagamento confirmado para o pedido " + pedido.getId());
        } else {
            System.out.println("Reserva vencida. Não foi possível confirmar o pagamento.");
        }
    }

    private boolean verificarValidadeReserva(Pedido pedido, Date dataAtual) {
        long diferencaEmDias = (dataAtual.getTime() - pedido.getDataVencimentoReserva().getTime()) / (1000 * 60 * 60 * 24);
        return diferencaEmDias <= 3;
    }
}
