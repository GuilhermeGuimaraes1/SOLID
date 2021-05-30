/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip_errado;

/**
 *
 * @author Guilherme
 */
class Lampada {
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
    
    public void Ligar() {
        setEstado(true);
    }
}
