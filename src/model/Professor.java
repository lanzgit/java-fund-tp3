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

    @Override
    public String getSituacao() {
        String resultado;
        if (salario < 1000) {
            resultado = "Pobre";
        } else {
            resultado = "Rico";
        }
        return resultado;
    }

    @Override
    public void imprimir(int pos) {
        System.out.printf("%d :: %s - %d - %s - R$%.2f - %s \n", 
            pos,
            getNome(), 
            getIdade(),
            this.getDisciplina(),
            this.getSalario(),
            getSituacao()
            );
    }
}
