package model;

public class Terceirizados extends Funcionario{
    private int fimContrato;
    private String funcao;
    
    public Terceirizados(int cpf, String nome, String endereco, int dataAdmissao, String titulacao, double salario, int fimContrato, String funcao){
    super(cpf,nome,endereco,dataAdmissao,titulacao,salario);
    this.fimContrato = fimContrato;
    this.funcao = funcao;
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
    
    @Override
    public double calculaSalario(){
    double salarioMestre = this.getSalarioBase() + 500;
    double salarioDoutor = this.getSalarioBase() + 1000;
    
    if(this.getTitulacao().equals("Mestre")){
        return salarioMestre;
    }
  if(this.getTitulacao().equals("Doutor")){
      return salarioDoutor;
  }
  else{
      return this.getSalarioBase();
  }
}
    }
