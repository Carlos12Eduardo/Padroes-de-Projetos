class Pedido {
    private double valor;
    private boolean aprovado;

    public Pedido(double valor){
        this.valor = valor;
        this.aprovado = false;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public double getValor(){
        return this.valor;
    }
    public void aprovar() {
        this.aprovado = true;
    }
    public void cancelar(){
        this.aprovado = false;
    }
    
}

abstract class PedidoHandler{
    protected PedidoHandler nextHandler = null;

    public PedidoHandler setNextHandler(PedidoHandler ph){
        this.nextHandler = ph;
        return ph;
    }
    public Pedido handle(Pedido p){
        if (this.nextHandler != null) {
            return this.nextHandler.handle(p);
        }
        return p;
    }
}

class Vendedor extends PedidoHandler{
    public Pedido handle(Pedido p){
        if(p.getValor() < 1000){
            System.out.println("O vendedor aprovou o pedido de: R$"+p.getValor());
            p.aprovar();
            return p;
        }
        return super.handle(p);
    }
}

class Gerente extends PedidoHandler{
    public Pedido handle(Pedido p){
        if(p.getValor() < 10000){
            System.out.println("O Gerente aprovou o pedido de: R$"+p.getValor());
            p.aprovar();
            return p;
        }
        return super.handle(p);
    }
}
public class ChainOfResposibility{
    public static void main(String[] args){
        Pedido p1 = new Pedido(2000);
        Gerente g1 = new Gerente();
        Vendedor v1 = new Vendedor();
        v1.setNextHandler(g1);
        v1.handle(p1);
        System.out.println("total do pedido p: "+ p1.getValor());

    }
}