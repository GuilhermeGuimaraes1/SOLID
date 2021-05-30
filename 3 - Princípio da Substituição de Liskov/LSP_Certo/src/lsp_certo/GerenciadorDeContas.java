
package lsp_certo;

public class GerenciadorDeContas {
    
    private double saldo;
    
    public void depositar( double valor ) {
        this.saldo += valor;
    }
    
    public void sacar ( double valor ) {
        if( valor <= this.saldo ) {
            this.saldo -= valor;
        }
        else {
            throw new IllegalArgumentException( "Saldo insuficiente." );
        }
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void rende( double taxa ) {
        this.saldo = this.saldo + ( this.saldo * taxa );
    }
}
