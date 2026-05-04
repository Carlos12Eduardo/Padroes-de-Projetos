interface Pagamento {
    public boolean realizarPagamento(double valor);
} 

class PagamentoInterno implements Pagamento{
    public boolean realizarPagamento(double valor){
        System.out.println("Valor de: "+valor+" pago usando o metodo realizarPagamento()");
        return true;
    }
    
}
class PagamentoExterno{
    public boolean pagar(double valor){
        System.out.println("Valor de: "+valor+" pago usando o metodo pagar()");
        return true;
    }
}

class PagamentoAdapter implements Pagamento{
    private PagamentoExterno pe;
    public PagamentoAdapter(PagamentoExterno pe){
        this.pe = pe;
    }
    public boolean realizarPagamento(double valor){
        return pe.pagar(valor);
    } 
}
public class Adapter {
    public static void main(String[] args){
        PagamentoInterno pi = new PagamentoInterno();
        PagamentoExterno pe = new PagamentoExterno();
        PagamentoAdapter pa = new PagamentoAdapter(pe);
        pi.realizarPagamento(200);
        pa.realizarPagamento(300);
    }
}
