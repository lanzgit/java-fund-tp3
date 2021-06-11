package App;
import java.util.Scanner;
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
        String nomeCompleto;
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
                        System.out.println("\nCADASTRAR PROFESSOR");

                        prof.setId(index);

                        System.out.print("Entre com o nome completo: ");
                        nomeCompleto = in.next();
                        prof.setNome(nomeCompleto.substring(0, nomeCompleto.indexOf(" ")));
                        prof.setNomeMeio(nomeCompleto.substring(nomeCompleto.indexOf(" ") + 1, nomeCompleto.lastIndexOf(" ")));
                        prof.setUltimoNome(nomeCompleto.substring(nomeCompleto.lastIndexOf(" ") + 1));

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
                    } else {
                        System.out.println("Capacidade maxima alcancada!");
                    }
                    break;
                case "2":
                    if(index < QTDE) {
                        Aluno al = new Aluno();
                        System.out.println("\nCADASTRAR ALUNO");

                        al.setId(index);

                        System.out.print("Entre com o nome completo: ");
                        nomeCompleto = in.next();
                        al.setNome(nomeCompleto.substring(0, nomeCompleto.indexOf(" ")));
                        al.setNomeMeio(nomeCompleto.substring(nomeCompleto.indexOf(" ") + 1, nomeCompleto.lastIndexOf(" ")));
                        al.setUltimoNome(nomeCompleto.substring(nomeCompleto.lastIndexOf(" ") + 1));
                        
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
