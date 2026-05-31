public class Habilitado extends MatriculaState {
    public Habilitado() {
        super.setDescricao("Habiltado");
    }

    public MatriculaState habilitar() {
        System.out.println("Aluno já está Habiltado.");
        return this;
    }

    public MatriculaState matricular() {
        System.out.println("Aluno matriculado com sucesso.");
        return new Matriculado();
    }
}
