
package lsp_certo;

public class ContaCorrenteComum {
    
    private GerenciadorDeContas gerenciador;
    
    public ContaCorrenteComum() {
        this.gerenciador = new GerenciadorDeContas();
    }
    
    public void deposita( double valor ) {
        this.gerenciador.depositar( valor );
    }
    
    public void saca( double valor ) {
        this.gerenciador.sacar( valor );
    }
    
    public double getSaldo() {
        return this.gerenciador.getSaldo();
    }
    
    public void rende() {
        this.gerenciador.rende( 0.02 );
    }


    @Override
        public String toString() {
    	return "Saldo conta corrente-> " + this.getSaldo();
    }
   
}
