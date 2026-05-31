public class EmAnalise extends MatriculaState{
    public EmAnalise(){
        super.setDescricao("em análise");
    }
    @Override
    public MatriculaState habilitar() {
        System.out.println("Matrícula habilitada com sucesso.");
        return new Habilitado();
    }

    @Override
    public MatriculaState desabilitar() {
        System.out.println("Matricula atualizada para não habilitada");
        return new NaoHabilitado();
    }
}
