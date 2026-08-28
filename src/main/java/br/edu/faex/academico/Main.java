package br.edu.faex.academico;

import br.edu.faex.academico.model.Aluno;

public class Main {
    static void main() {
        Aluno aluno = new Aluno("Aleandro Ribeiro de Lima", "aleandro.lima@faex.edu.br");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("E-mail: " + aluno.getEmail());
        System.out.println("Ativo: " + aluno.isAtivo());
    }
}
