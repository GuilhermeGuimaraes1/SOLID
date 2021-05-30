
package isp_errado;

public class Vendedor extends Funcionario {
    
    private double salario;
    private int totalVendas;
    
    public Vendedor( double salario, int totalVenda ) {
        this.salario = salario;
        this.totalVendas = totalVendas;
    }
    
    @Override
    public double getSalario() {
        return this.salario + this.getComissao();
    }
   
    @Override
    public double getComissao() {
	return this.totalVendas * 0.2;
	}
}
