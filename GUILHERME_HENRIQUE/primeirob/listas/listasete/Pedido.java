package GUILHERME_HENRIQUE.primeirob.listas.listasete;

import java.util.Date;
import java.util.List;

public class Pedido { 
    private Date dataCriacao;
    private List<Item> itens;

    public Pedido(int id, Date dataCriacao, Date dataVencimentoReserva, Cliente cliente, Vendedor vendedor, Loja loja, List<Item> itens) {
        this.dataCriacao = dataCriacao;
        this.itens = itens;
    }

    public Pedido(int i, Date date, Date date2, Date date3, Vendedor cliente2, Vendedor vendedor2, Loja loja2,
            Object itens2) {
    }

    public double calcularValorTotal() {
        return itens.stream().mapToDouble(Item::getValor).sum(); // Agora está correto
    }

    public void gerarDescricaoVenda() {
        System.out.println("Data de Criação: " + dataCriacao);
        System.out.println("Valor Total: R$ " + calcularValorTotal());
    }

    public Date getDataVencimentoReserva() {
        throw new UnsupportedOperationException("Unimplemented method 'getDataVencimentoReserva'");
    }

    public void adicionarItem(Item item2) {
        throw new UnsupportedOperationException("Unimplemented method 'adicionarItem'");
    }

    public String getId() {
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }
}
