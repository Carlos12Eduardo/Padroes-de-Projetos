public class Aluno {
    private String nome;
    private MatriculaState matricula;

    public Aluno(String nome) {
        this.nome = nome;
        this.matricula = new Habilitado();
    }

    public void getMatricula() {
        System.out.println("Aluno: " + this.nome);
        System.out.println("Status da Matrícula: " + this.matricula.getDescricao());
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void habilitarAluno() {
        this.matricula = this.matricula.habilitar();
    }

    public void matricularAluno() {
        this.matricula = this.matricula.matricular();
    }

    public void desistirAluno() {
        this.matricula = this.matricula.desistir();
    }

    public void analisarAluno() {
        this.matricula = this.matricula.analisar();
    }

    public void desabilitarAluno() {
        this.matricula = this.matricula.desabilitar();
    }

    public void trancarAluno() {
        this.matricula = this.matricula.trancar();
    }

    public void cursarAluno() {
        this.matricula = this.matricula.cursar();
    }

    public void cancelarAluno() {
        this.matricula = this.matricula.cancelar();
    }

}