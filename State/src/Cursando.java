public class Cursando extends MatriculaState{
    public Cursando(){
        super.setDescricao("Cursando");
    }
    @Override
    public MatriculaState trancar() {
        System.out.println("Matrícula trancada com sucesso.");
        return new Trancado();
    }

    @Override
    public MatriculaState matricular() {
        System.out.println("Matrícula atualizada para matriculado.");
        return new Matriculado();
    }

    @Override
    public MatriculaState cancelar() {
        System.out.println("Matriculado cancelada com sucesso.");
        return new Cancelado();
    }
}