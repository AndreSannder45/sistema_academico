package br.com.faex.academico.model;

public class Aluno {
        private int id;
        private boolean ativo = true;
        private String email;
        private String nome;

    public Aluno() {

    }

    public Aluno(String email, String nome) {
        this.email = email;
        this.nome = nome;
        this.ativo = true;
    }

    public int getId() {
        return id;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
