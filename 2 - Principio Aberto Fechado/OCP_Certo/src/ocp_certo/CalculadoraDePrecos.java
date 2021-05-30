
package ocp_certo;

public class CalculadoraDePrecos {
    private TabelaPreco tabela;
    private ServicoDeFrete frete;

    public CalculadoraDePrecos(TabelaPreco tabela, ServicoDeFrete frete) {
        this.tabela = tabela;
        this.frete = frete;
    }
    
    public double calcula( Produto produto ) {
        double desconto = tabela.calculaDesconto(produto.getValor());
        double valorFrete = frete.calculaFrete(produto.getEstado());
        return produto.getValor() * ( 1 - desconto ) + valorFrete;
    }
}
