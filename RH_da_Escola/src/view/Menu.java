package view;

import java.util.Scanner;

import model.*;

public class Menu
{
	private int cpf;
	private String nome;
	private String endereco;
	private int dataAdmissao;
	private String titulacao;
	private double salarioBase;
	private int siape;
	private String area;
	private Scanner leitor;
	private String departamento;
	private int fimContrato;
	private String funcao;
	
	
	public Menu()
	{
		leitor = new Scanner(System.in);
	}
	
	private void informacoesFuncionario()
	{
		System.out.println("Qual o CPF? ");
		this.cpf = leitor.nextInt();
		System.out.println("Qual o nome? ");
		this.nome = leitor.next();
		System.out.println("Endereço: ");
		this.endereco = leitor.next();
		System.out.println("Qual a data de admissão? ");
		this.dataAdmissao = leitor.nextInt();
		System.out.println("Qual a titulação? ");
		this.titulacao = leitor.next();
		System.out.println("Quanto é o salario base? ");
		this.salarioBase = leitor.nextDouble();
	}
	
	public Docente dadosDocente()
	{
		informacoesFuncionario();
		System.out.println("Siape:");
		this.siape = leitor.nextInt();
		System.out.println("Em qual area voce trabalha? ");
		this.area = leitor.next();
		
		Docente docen = new Docente(this.cpf, this.nome, this.endereco, this.dataAdmissao, this.titulacao, this.salarioBase, this.siape, this.area);
		
		docen.calculaSalario();
		return docen;
	}
	
	public Tecnico dadosTecnico()
	{
		informacoesFuncionario();
		System.out.println("Siape:");
		this.siape = leitor.nextInt();
		System.out.println("Departamento:");
		this.departamento = leitor.next();
		
		Tecnico tec = new Tecnico(this.cpf, this.nome, this.endereco, this.dataAdmissao, this.titulacao, this.salarioBase, this.siape, this.departamento);
		
		tec.calculaSalario();
		return tec;
	}
	
	public Terceirizados dadosTerceirizado()
	{
		informacoesFuncionario();
		System.out.println("Data do fim de contrato:");
		this.fimContrato = leitor.nextInt();
		System.out.println("função:");
		this.funcao = leitor.next();
		
		Terceirizados ter = new Terceirizados(this.cpf, this.nome, this.endereco, this.dataAdmissao, this.titulacao, this.salarioBase, this.fimContrato, this.funcao);
		
		ter.calculaSalario();
		return ter;
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

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getSiape() {
        return siape;
    }

    public void setSiape(int siape) {
        this.siape = siape;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Scanner getLeitor() {
        return leitor;
    }

    public void setLeitor(Scanner leitor) {
        this.leitor = leitor;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getFimContrato() {
        return fimContrato;
    }

    public void setFimContrato(int fimContrato) {
        this.fimContrato = fimContrato;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
        
}