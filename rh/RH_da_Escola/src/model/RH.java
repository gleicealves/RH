package model;

import java.util.ArrayList;
import java.util.List;

public class RH {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    
    public void adicionaFuncionario(Funcionario fun){
        funcionarios.add(fun);
    }
    public Funcionario pesquisaFuncionario(int Cpf){
        for (Funcionario fun: funcionarios){
            if(fun.getCpf().equalsIgnoreCase(Cpf))
            {
                return fun;
            }
        }
            return null;
            
        
        
       //public ArrayList<Funcionario> getFuncionarios()
      // {
      //     return funcionarios;
       //}
   
    }
}
