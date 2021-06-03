package model;

public class Professor extends Pessoa {

   private String disciplina;
   private float salario;

   public Professor() {
       super();
   }

   public Professor(String nome, int idade, String disciplina, float salario) {
       super(nome, idade);
       this.disciplina = disciplina;
       this.salario = salario;
   }

   public String getDisciplina() {
       return disciplina;
   }

   public void setDisciplina(String disciplina) {
       this.disciplina = disciplina;
   }

   public float getSalario() {
       return salario;
   }

   public void setSalario(float salario) {
       this.salario = salario;
   }
}
