
class Habilitado extends MatriculaState {
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

class Matriculado extends MatriculaState {
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

class Trancado extends MatriculaState {
    public Trancado() {
        super.setDescricao("Trancado");
    }
}

public class Main {
    public static void main(String[] args) {
        Aluno a = new Aluno("Carlos");
        a.getMatricula();
        a.habilitarAluno();
        a.getMatricula();
        a.matricularAluno();
        a.cancelarAluno();
        a.desabilitarAluno();
        a.trancarAluno();
        a.getMatricula();
    }
}