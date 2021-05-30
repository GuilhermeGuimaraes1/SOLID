
package dip_certo;

public class Botao {
    private Dispositivo dispositivo;
    private Lampada lampada;
    
    public void Acionar() {
        if( lampada.getEstado() == false){
           lampada.Ligar(); 
        }
    }
}
