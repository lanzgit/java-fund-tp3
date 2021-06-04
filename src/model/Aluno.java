package model;

public class Aluno extends Pessoa{

    private float av1;
    private float av2;
    private float media;
    
    public Aluno() {
        super();
    }

    public Aluno(String nome, int idade, float av1, float av2, float media, String situacao) {
        super(nome, idade);
        this.av1 = av1;
        this.av2 = av2;
        this.media = media;
    }

    public float getAv1() {
        return av1;
    }

    public void setAv1(float av1) {
        this.av1 = av1;
    }

    public float getAv2() {
        return av2;
    }

    public void setAv2(float av2) {
        this.av2 = av2;
    }

    public float getMedia() {
        return media;
    }
    
    public void setMedia(float media) {
        this.media = media;
    }

    public float calcularMedia(float nota1, float nota2) {
        return (nota1 + nota2) / 2;
    }

    @Override
    public String getSituacao() {
        String resultado;
        if (media < 4){
            resultado = "Reprovado";
        } else if (media >= 4 && media < 7) {
            resultado = "Prova Final";
        } else {
            resultado = "Aprovado";
        }      
        return resultado;
    }

    @Override
    public void imprimir(int pos) {
        System.out.printf("%d :: %s - %d - Nota 2: %.2f - Nota 1: %.2f - Media: %.2f - %s \n", 
            pos,
            getNome(), 
            getIdade(),
            this.getAv1(),
            this.getAv2(),
            this.getMedia(),
            getSituacao()
            );
    }

}
