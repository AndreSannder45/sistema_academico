package br.edu.faex.academico;

import br.edu.faex.academico.controller.AlunoController;
import br.edu.faex.academico.model.Aluno;
import br.edu.faex.academico.repository.AlunoRepository;
import br.edu.faex.academico.service.AlunoService;

public class Main {
    static void main() {
        Aluno aluno1 = new Aluno("Aleandro Ribeiro de Lima", "aleandro.lima@faex.edu.br");
        Aluno aluno2 = new Aluno("Maria Helena de Lima", "maria.lima@faex.edu.br");

        AlunoRepository alunoRepository = new AlunoRepository();
        AlunoService alunoService = new AlunoService(alunoRepository);
        AlunoController alunoController = new AlunoController(alunoService);

        alunoController.cadastrar(aluno1);
        alunoController.cadastrar(aluno2);

        for (Aluno aluno : alunoController.listar()) {
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("E-mail: " + aluno.getEmail());
            System.out.println("Ativo: " + aluno.isAtivo());
            System.out.println("-------------------------");
        }

    }
}
