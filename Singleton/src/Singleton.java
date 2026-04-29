class ChaveSingleton {
    private static ChaveSingleton instance;
    private String descricao;

    private ChaveSingleton() {
    }

    public static ChaveSingleton getInstance() {
        if (instance == null) {
            instance = new ChaveSingleton();
        }
        return instance;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}

public class Singleton {

    public static void main(String[] args) {
        ChaveSingleton c1 = ChaveSingleton.getInstance();
        c1.setDescricao("chave 1");
        ChaveSingleton c2 = ChaveSingleton.getInstance();
        System.out.println("nome da chave c1: " + c1.getDescricao());
        System.out.println("nome da chave c1: " + c2.getDescricao());

    }
}