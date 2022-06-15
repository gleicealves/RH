package view;

import java.util.Scanner;
import model.Funcionario;
import model.RH;

public class Main {

    public static void main(String[] args) {
        
        
        Scanner leitor = new Scanner(System.in);
        int escolher;
        RH rh = new RH();
        Menu menu = new Menu();
        
        
            System.out.println("++++ Digite uma opção: ++++" + "\n");
            System.out.println("1 - Cadastrar novo funcionario.");
            System.out.println("2 - Pesquisar por um funcionario.");
            System.out.println("3 - Mostrar todos os funcionário." + "\n");
            escolher = leitor.nextInt();
            
            
            switch (escolher) {
                case 1: {
                    System.out.println("1-Docente");
                    System.out.println("2-Técnico");
                    System.out.println("3-Terceirizado");

                    int escolherCadastro = leitor.nextInt();
                    if (escolherCadastro == 1) {
                        rh.adicionaFuncionario(menu.dadosDocente());
                    } else if (escolherCadastro == 2) {
                        rh.adicionaFuncionario(menu.dadosTecnico());
                    } else if (escolherCadastro == 3) {
                        rh.adicionaFuncionario(menu.dadosTerceirizado());
                    }
                    break;
                }

                case 2: {
                    System.out.println("Digite o nome do funcionário que você deseja procurar:");
                    String nome = leitor.next();
                    System.out.println(rh.pesquisaFuncionario(nome));
                    break;
                }

                case 3: {
                    System.out.println();
                    System.out.println(rh.getClass());
                    break;
                }
            }
        }
        }



