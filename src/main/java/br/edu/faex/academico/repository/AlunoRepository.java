package br.edu.faex.academico.repository;

import br.edu.faex.academico.model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoRepository {
    private List<Aluno> alunos = new ArrayList<>();

    public void salvar(Aluno aluno){
        alunos.add(aluno);
    }
    public List<Aluno> listar(){
        return alunos;
    }
}
