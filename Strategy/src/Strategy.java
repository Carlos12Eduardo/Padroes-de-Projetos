interface SenhaStrategy {
    public boolean autenticar(String senha);
}

class SenhaPadrao implements SenhaStrategy{
    public boolean autenticar(String senha){
        System.out.println("se autenticando por senha padrão");
        return true;
    }
}

class SenhaBiometria implements SenhaStrategy{
    public boolean autenticar(String senha){
        System.out.println("Se autenticando por biometria");
        return true;
    }
}

class SenhaGoogle implements SenhaStrategy{
    public boolean autenticar(String senha){
        System.out.println("se autenticando usando conta do goole");
        return true;
    }
}


class Login{
    private SenhaStrategy strategy;
    
    public void setSenhaStrategy(SenhaStrategy strategy) {
        this.strategy = strategy;
    }
    public boolean logar(String senha){
        return strategy.autenticar(senha);
    }
}
public class Strategy {
    public static void main(String[] args) {
        Login l = new Login();        
        l.setSenhaStrategy(new SenhaGoogle());
        l.logar("123");
        l.setSenhaStrategy(new SenhaPadrao());
        l.logar("123");
        l.setSenhaStrategy(new SenhaBiometria());
        l.logar("123");
    }
}