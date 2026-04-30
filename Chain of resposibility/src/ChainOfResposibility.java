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


public class ChainOfResposibility{
    public static void main(String[] args){
        Pedido p1 = new Pedido(500);
        System.out.println("total do pedido p: "+ p1.getValor());
    }
}