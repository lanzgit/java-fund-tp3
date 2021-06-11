package model;

public class Professor extends Pessoa {

    private String disciplina;
    private float salario;

    public Professor() {
        super();
    }

    public Professor(
        int id, String nome, String nomeMeio, String ultimoNome,
        int idade, String disciplina, float salario) {

        super(id, nome, nomeMeio, ultimoNome, idade);
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
    public void imprimir() {
        System.out.printf("%d :: %s - %d - %s - R$%.2f - %s \n", 
            getId(),
            getNome(), 
            getIdade(),
            this.getDisciplina(),
            this.getSalario(),
            getSituacao()
            );
    }
}
