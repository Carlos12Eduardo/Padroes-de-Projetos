abstract class Relatorio{
    public final void efetuarConsulta(){
        this.conectarBancoDeDados();
        this.filtrarDados();
        this.mostrarDados();
    }
    private void conectarBancoDeDados(){
        System.out.println("conectando ao banco de dados.");
    }
    protected void filtrarDados(){
        System.out.println("Filtrando dados.");
    }
    private void mostrarDados(){
        System.out.println("apresentando os dados ao usuário");
    };
}

class RelatorioOracle extends Relatorio {
    @Override
    protected void filtrarDados() {
        System.out.println("usando select para banco de dados Oracle.");
    }
}
class RelatorioSqlServer extends Relatorio {
    @Override
    protected void filtrarDados() {
        System.out.println("usando select para banco de dados SqlServer.");
    }
}

public class TemplateMethod {
    public static void main(String[] args) {
        Relatorio ro = new RelatorioOracle();
        Relatorio rs = new RelatorioSqlServer();
        ro.efetuarConsulta();
        rs.efetuarConsulta();
    }
}
