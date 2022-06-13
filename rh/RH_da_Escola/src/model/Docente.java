package model;

public class Docente extends Funcionario{
    private int siape;
    private String areaVinculado;
    
    public Docente(int cpf, String nome, String endereco, int dataAdmissao, String titulacao, double salario, int siape, String areaVinculado){
        super(cpf,nome,endereco,dataAdmissao,titulacao,salario);
        this.siape = siape;
        this.areaVinculado = areaVinculado;
    }

    public int getSiape() {
        return siape;
    }

    public void setSiape(int siape) {
        this.siape = siape;
    }

    public String getAreaVinculado() {
        return areaVinculado;
    }

    public void setAreaVinculado(String areaVinculado) {
        this.areaVinculado = areaVinculado;
    }

  @Override
  public double calculaSalario(){
    double salarioMestre = this.getSalarioBase() + (this.getSalarioBase() * 0.20);
    double salarioDoutor = this.getSalarioBase() + (this.getSalarioBase() * 0.40);
    
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