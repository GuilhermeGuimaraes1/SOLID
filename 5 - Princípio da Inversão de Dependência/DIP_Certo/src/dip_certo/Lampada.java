
package dip_certo;

public class Lampada implements Dispositivo {
        private boolean estado;
    
    public Lampada() {
        this.estado = false;
    }
    
    public void setEstado( boolean estado ) {
        this.estado = estado;
    }
    
    public boolean getEstado() {
        return this.estado;
    }
    
    @Override
    public void Ligar() {
        setEstado(true);
    }
    
    @Override
    public void Desligar(){
        setEstado(false);
    }
}
