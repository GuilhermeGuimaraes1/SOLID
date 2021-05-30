
package dip_errado;

public class Botao {
    private Lampada lampada;
    
    public void Acionar() {
        if( lampada.getEstado() == false){
           lampada.Ligar(); 
        }
    }
}
