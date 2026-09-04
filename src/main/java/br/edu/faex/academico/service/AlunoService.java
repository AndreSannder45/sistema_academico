package br.edu.faex.academico.service;

import br.edu.faex.academico.model.Aluno;
import br.edu.faex.academico.repository.AlunoRepository;

import java.util.List;

public class AlunoService {
    private AlunoRepository repository;

    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }

    public void cadastrar(Aluno aluno){
        if (aluno.getNome() == null || aluno.getNome().isBlank()) {
            System.out.println("O nome do aluno é obrigatório.");
            return;
        }

        if (aluno.getEmail() == null || aluno.getEmail().isBlank()) {
            System.out.println("O e-mail do aluno é obrigatório.");
            return;
        }

        if (!aluno.getEmail().contains("@")) {
            System.out.println("E-mail inválido.");
            return;
        }

        if (repository.listar().stream()
                .anyMatch(a -> a.getEmail().equalsIgnoreCase(aluno.getEmail()))) {
            System.out.println("E-mail já cadastrado.");
            return;
        }

        this.repository.salvar(aluno);
    }

    public List<Aluno> listar(){
        return repository.listar();
    }

}
