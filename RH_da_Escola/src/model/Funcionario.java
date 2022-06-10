package model;

public class Funcionario {

    private int cpf;
    private String nome;
    private String endereco;
    private int dataAdmissao;
    private String titulacao;
    private double salarioBase;

    public Funcionario(int cpf, String nome, String endereco, int dataAdmissao, String titulacao, double salarioBase) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.dataAdmissao = dataAdmissao;
        this.titulacao = titulacao;
        this.salarioBase = salarioBase;   
    }
    
    
    public double calculaSalario(){
    return this.getSalarioBase();
    }
    
    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(int dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalario(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
