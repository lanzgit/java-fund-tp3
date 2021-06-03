package model;

public class Aluno extends Pessoa{

    private float av1;
    private float av2;
    private float media;
    private String situacao;
    
    public Aluno() {
        super();
    }

    public Aluno(String nome, int idade, float av1, float av2, float media, String situacao) {
        super(nome, idade);
        this.av1 = av1;
        this.av2 = av2;
        this.media = media;
        this.situacao = situacao;
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
    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
