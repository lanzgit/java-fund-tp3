package App;
import java.util.Scanner;
import exceptions.NomeIncompletoException;
import model.Aluno;
import model.Pessoa;
import model.Professor;
public class ControleAcademico {

    private static Pessoa[] pessoas;
    private static final int QTDE = 100; 
    static int index = 0;

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {

        Scanner in = new Scanner(System.in);
        String op = null;
        pessoas = new Pessoa[QTDE];
        

        do {
            System.out.println("-------------------MENU------------------------");
            System.out.println("[1] Cadastrar Professor");
            System.out.println("[2] Cadastar Aluno");
            System.out.println("[3] Consultar a situacao de um docente/discente");
            System.out.println("[4] Sair");
            System.out.println("-----------------------------------------------");

            System.out.print("Entre com a opcao: ");
            op = in.next();

            switch (op) {
                case "1":
                    if(index < QTDE) {
                        Professor prof = new Professor();
                        try {
                            System.out.println("\nCADASTRAR PROFESSOR");
                            in.nextLine();

                            prof.setId(index);

                            try {
                                System.out.print("Entre com o nome completo: ");
                                prof.setNome(in.nextLine());
                            }
                            catch (NomeIncompletoException err) {
                                System.out.println(err.getMessage());
                                in.nextLine();
                                break;
                            }

                            System.out.print("Entre com a idade: ");
                            prof.setIdade(in.nextInt());

                            System.out.print("Entre com disciplina lecionada: ");
                            prof.setDisciplina(in.next());

                            System.out.print("Entre com o salario: ");
                            prof.setSalario(in.nextFloat());

                            pessoas[index] = prof;
                            System.out.println("Professor Cadastrado com sucesso:");
                            pessoas[index].imprimir();
                            System.out.println();
                            index ++;   
                        }
                        finally {
                            System.out.println("voltar...");
                            in.nextLine();
                        }
                    } else {
                        System.out.println("Capacidade maxima alcancada!");
                    }
                    break;
                case "2":
                    if(index < QTDE) {
                        try {
                            Aluno al = new Aluno();
                            System.out.println("\nCADASTRAR ALUNO");
                            in.nextLine();

                            al.setId(index);

                            System.out.print("Entre com o nome completo: ");
                            try {
                                al.setNome(in.nextLine());
                            } catch (NomeIncompletoException e) {
                                e.getMessage();
                            }
                            
                            System.out.print("Entre com a idade: ");
                            al.setIdade(in.nextInt());

                            System.out.print("Entre com a 1a. Nota: ");
                            al.setAv1(in.nextFloat());

                            System.out.print("Entre com a 2a. Nota: ");
                            al.setAv2(in.nextFloat());
                            
                            al.setMedia(al.calcularMedia(al.getAv1(), al.getAv2())); 
                            pessoas[index] = al;
                            System.out.println("Aluno cadastro com sucesso:");
                            pessoas[index].imprimir();
                            index ++;
                        }
                        finally {
                            System.out.println("voltar...");
                            in.nextLine();
                        }
                    } else {
                        System.out.println("Capacidade maxima alcancada!");
                    }
                    break;
                case "3":
                    System.out.println("\nCONSULTAR SITUACAO");
                    System.out.print("Entre com o numero do docente/discente: ");
                    int pos = in.nextInt();

                    if (pos >= 0  && pos < index) {
                            pessoas[pos].imprimir();
                        System.out.println();
                    } else {
                        System.out.println("Pessoa nao encontrada!");
                        System.out.println();
                    }
                    break;
                case "4":
                    System.out.println("saindo...");
                    break;
                default:
                    break;
            }
        } while(!op.equals("4"));
    }
}
