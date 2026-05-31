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
        System.out.println("Matriculad trancada com sucesso.");
        return new Trancado();
    }
}