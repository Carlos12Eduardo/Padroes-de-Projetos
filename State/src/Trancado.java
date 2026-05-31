public class Trancado extends MatriculaState {
    public Trancado() {
        super.setDescricao("Trancado");
    }
    
    @Override
    public MatriculaState analisar() {
        System.out.println("Matricula atualizada para em análise.");
        return new EmAnalise();
    }
}