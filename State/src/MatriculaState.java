public class MatriculaState {
    private String descricao;

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public MatriculaState habilitar() {
        System.out.println("Não é possível habilitar matricula.");
        return this;
    }

    public MatriculaState matricular() {
        System.out.println("Não é possível realizar matricula.");
        return this;
    }

    public MatriculaState desistir() {
        System.out.println("Não é possível mudar para desistente");
        return this;
    }

    public MatriculaState analisar() {
        System.out.println("Não é possível colocar matricula em analise");
        return this;
    }

    public MatriculaState desabilitar() {
        System.out.println("Não é possível desabilitar matricula.");
        return this;
    }

    public MatriculaState trancar() {
        System.out.println("Não é possível trancar matricula.");
        return this;
    }

    public MatriculaState cursar() {
        System.out.println("Não é possível colocar em cursando");
        return this;
    }

    public MatriculaState cancelar() {
        System.out.println("Não é possível cancelar matricula.");
        return this;
    }
}
