
package lsp_certo;

public class ContaSalario {
    
    private GerenciadorDeContas gerenciador;
    
    public ContaSalario() {
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

    @Override
    public String toString() {
        return "Saldo conta Salario -> " + this.getSaldo();
    }
 
}
