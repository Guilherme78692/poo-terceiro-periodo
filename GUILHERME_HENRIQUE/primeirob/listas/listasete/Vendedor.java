package GUILHERME_HENRIQUE.primeirob.listas.listasete;

public class Vendedor {
    private String nome;
    private int idade;
    private String cpf;
    private Endereco endereco;
    private double salario;

     
    public Vendedor(String nome, int idade, String cpf, Endereco endereco, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco.apresentarLogradouro);
        System.out.println("Salário: " + salario);
    }
}
