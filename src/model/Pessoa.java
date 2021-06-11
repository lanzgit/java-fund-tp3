package model;

public abstract class Pessoa {
    
    private int id;
    private String nome;
    private String nomeMeio;
    private String ultimoNome;
    private int idade;

    public Pessoa() {}

    public Pessoa(int id, String nome, String nomeMeio, String ultimoNome, int idade) {
        super();
        this.id = id;
        this.nome = nome;
        this.nomeMeio = nomeMeio;
        this.ultimoNome = ultimoNome;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeMeio() {
        return nomeMeio;
    }

    public void setNomeMeio(String nomeMeio) {
        this.nomeMeio = nomeMeio;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public abstract String getSituacao(); 

    public abstract void imprimir(); 

}
