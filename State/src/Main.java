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