package test;

import model.Aluno;
import model.Pessoa;
import model.Professor;

public class Teste {

    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        aluno.setNome("Vinicius");
        aluno.setIdade(18);

        pessoa.setNome("Qualquer");
        pessoa.setIdade(99);

        professor.setNome("Elberth");
        professor.setIdade(30);

        System.out.println(pessoa.getNome());
        System.out.println(aluno.getNome());
        System.out.println(professor.getNome());
    }
    
}
