public class Matriculado extends MatriculaState {
    public Matriculado() {
        super.setDescricao("Matriculado");
    }

    public MatriculaState habilitar() {
        System.out.println("Aluno já passou pelo estado de habilado.");
        return this;
    }

    public MatriculaState matricular() {
        System.out.println("Aluno já está matriculado.");
        return this;
    }

    public MatriculaState trancar() {
        System.out.println("Matricula trancada com sucesso.");
        return new Trancado();
    }

    @Override
    public MatriculaState cursar() {
        System.out.println("Matricula atualizada para cursando.");
        return new Cursando();
    }
}