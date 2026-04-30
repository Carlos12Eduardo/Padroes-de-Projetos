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


public class ChainOfResposibility{
    public static void main(String[] args){
        
    }
}