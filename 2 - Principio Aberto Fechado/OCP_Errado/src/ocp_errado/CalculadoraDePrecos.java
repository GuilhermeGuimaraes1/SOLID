
package ocp_errado;

public class CalculadoraDePrecos {
    
    public double calcula( Produto produto ) {
        Frete frete = new Frete();
        double desconto = 0d;
        
        int regra = produto.getMeioPagamento();
        
        switch( regra ) {
            case 1:
                System.out.println( "Venda à vista" );
                TabelaPrecoAVista tabela1 = new TabelaPrecoAVista();
                desconto = tabela1.calculaDesconto( produto.getValor() );
                break;
                
            case 2:
                System.out.println( "Venda à Prazo" );
                TabelaDePrecoAPrazo tabela2 = new TabelaDePrecoAPrazo();
                desconto = tabela2.calculaDesconto( produto.getValor() );
                break;
                
        }
        
        double valorFrete = frete.calculaFrete( produto.getEstado() );
        return produto.getValor() * ( 1 - desconto ) + valorFrete;
    }
}
