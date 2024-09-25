package GUILHERME_HENRIQUE.primeirob.listas.listasete;

public class TestObjects {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("MG", "Belo Horizonte", "Centro", 123, "Apto 12");
        Vendedor vendedor = new Vendedor("Pedro", 30, "12345678900", endereco, 2500.0);

        vendedor.apresentar();
    }
}
