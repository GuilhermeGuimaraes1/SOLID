/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package respunicacorreta;

/**
 *
 * @author Guilherme
 */
public enum Cargo {
    DESENVOLVEDOR_SENIOR(new RegraVinteDoisEMeioPorcento()),
    DESENVOLVEDOR_JUNIOR(new RegraOnzePorcento());
    
    	private RegraDeCalculo regra;
	
	Cargo(RegraDeCalculo regra){
		this.regra = regra;
	}

	public RegraDeCalculo getRegra() {
		return regra;
	}
    
}
