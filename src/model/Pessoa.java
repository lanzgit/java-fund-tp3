package model;

import exceptions.NomeIncompletoException;

public abstract class Pessoa {
    
    private int id;
    private String nome;
    private String nomeMeio;
    private String ultimoNome;
    private int idade;

    public Pessoa() {
    }

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

    public StringBuilder getNome() {

        StringBuilder sb = new StringBuilder();
        sb.append(nome);
        sb.append(" ");
        sb.append(nomeMeio);
        sb.append(" ");
        sb.append(ultimoNome);

        return sb;
    }

    public void setNome(String nome) throws NomeIncompletoException {


        int posInicial = nome.indexOf(" ");
        int posFinal = nome.lastIndexOf(" ");

        if(posInicial == -1){
            throw new NomeIncompletoException("Preenchimento imcompleto!");
        }

        this.nome = nome.substring(0, posInicial);
        this.nomeMeio = nome.substring(posInicial, posFinal).trim();
        this.ultimoNome = nome.substring(posFinal).trim();

        if (this.ultimoNome == null || this.nome == null || this.nomeMeio == null) {
            throw new NomeIncompletoException("Preenchimento imcompleto!\nNome, sobrenome e ultimo nome...");
        }
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
