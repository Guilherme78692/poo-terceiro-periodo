package GUILHERME_HENRIQUE.primeirob.listas.listasete;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<Item> itens;
    private Scanner scanner;

    public Menu() {
        itens = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar item");
            System.out.println("2. Listar itens");
            System.out.println("3. Buscar item por nome");
            System.out.println("4. Criar pedido");
            System.out.println("0. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            switch (opcao) {
                case 1:
                    cadastrarItem();
                    break;
                case 2:
                    listarItens();
                    break;
                case 3:
                    buscarItem();
                    break;
                case 4:
                    criarPedido();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private void cadastrarItem() {
        System.out.println("Cadastro de novo item");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Tipo: ");
        String tipo = scanner.nextLine();
        System.out.print("Valor: ");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Consumir quebra de linha

        Item item = new Item(itens.size() + 1, nome, tipo, valor);
        itens.add(item);
        System.out.println("Item cadastrado com sucesso!");
    }

    private void listarItens() {
        if (itens.isEmpty()) {
            System.out.println("Nenhum item cadastrado.");
        } else {
            System.out.println("Lista de itens:");
            itens.forEach(Item::gerarDescricao);
        }
    }

    private void buscarItem() {
        System.out.print("Digite o nome do item: ");
        String nome = scanner.nextLine();
        Item encontrado = itens.stream()
                .filter(item -> item.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);
        
        if (encontrado != null) {
            encontrado.gerarDescricao();
        } else {
            System.out.println("Item não encontrado.");
        }
    }

    private void criarPedido() {
        System.out.println("Criar novo pedido");

        System.out.print("Digite o nome do cliente: ");
        scanner.nextLine();

        System.out.println("Escolha um item pelo ID:");
        listarItens();
        int itemId = scanner.nextInt();
        Item item = itens.stream()
                .filter(i -> i.getId() == itemId)
                .findFirst()
                .orElse(null);

        if (item == null) {
            System.out.println("Item não encontrado.");
            return;
        }

        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha

        // Criar o pedido
        List<Item> itensPedido = new ArrayList<>();
        for (int i = 0; i < quantidade; i++) {
            itensPedido.add(item);
        }

        @SuppressWarnings("deprecation")
        Pedido pedido = new Pedido(itensPedido.size(), new Date(quantidade), new Date(quantidade, quantidade, quantidade), null, null, null, itensPedido);
        pedido.gerarDescricaoVenda();
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.exibirMenu();
    }
}
