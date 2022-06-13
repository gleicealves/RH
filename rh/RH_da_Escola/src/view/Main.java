package view;

import java.util.Scanner;
import model.Funcionario;
import model.RH;

public class Main {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int escolha;
        RH rh = new RH();
        
        do
        {
        System.out.println("Digite uma opção: " + "\n");
        System.out.println("1- Cadastrar novo funcionario.");
        System.out.println("2- Pesquisar por um funcionario.");
        System.out.println("3- Mostrar todos os funcionário.");
        escolha = leitor.nextInt();
        
        switch(escolha){
            case 1:
				{
					System.out.println("1 - Docente");
					System.out.println("2 - Técnico");
					System.out.println("3 - Terceiro");
					
					int escolhaCadastro = leitor.nextInt();
					if (escolhaCadastro == 1)
					{
						rh.adicionaFuncionario(m.dadosDocente());
					}
					
					else if (escolhaCadastro == 2)
					{
						rh.adicionaFuncionario(m.dadosTecnico());
					}
					
					else if (escolhaCadastro == 3)
					{
						rh.adicionaFuncionario(m.dadosTerceirizado());
					}
					break;
				}
				
				case 2:
				{
					System.out.println("Digite o funcionário que você deseja procurar:");
					String nome = leitor.next();
					System.out.println(rh.pesquisaFuncionario(nome));
					break;
				}
				
				case 3:
				{
					System.out.println();
					System.out.println(rh.getFuncionarios());
					break;
				}
			}
        }
        }
    
}
