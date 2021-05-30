
package lsp_errado;

public class ContaSalario extends ContaCorrenteComum {
    
    @Override
    public void rende() {
        try {
            throw new Exception( "Essa conta não possui rendimento" );
        } catch (Exception ex) {
            //Implementar
        }
    } 
}
