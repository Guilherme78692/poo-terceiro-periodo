package GUILHERME_HENRIQUE.primeirob.listas.listasete;

public class Item {
    private int id;
    private String nome;
    private String tipo;
    private double valor;

    public Item(int id, String nome, String tipo, double valor) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void gerarDescricao() {
        System.out.println("ID: " + id + ", Nome: " + nome + ", Tipo: " + tipo + ", Valor: R$ " + valor);
    }

    public String getNome() {
        throw new UnsupportedOperationException("Unimplemented method 'getNome'");
    }

    public int getId() {
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }
}
