package GUILHERME_HENRIQUE.primeirob.listas.listasete;

public class Cliente {
    private String nome;
    private int idade;
    private Endereco endereco;

    // Construtor
    public Cliente(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    // Novo Construtor com atributos de endereço como strings
    public Cliente(String nome, int idade, String estado, String cidade, String bairro, int numero, String complemento) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = new Endereco(estado, cidade, bairro, numero, complemento);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    // Método de apresentação
    public void apresentarse() {
        System.out.println("Cliente: " + nome + ", Idade: " + idade);
        endereco.apresentarLogradouro();
    }
}
