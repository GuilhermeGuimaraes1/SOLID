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
public class RegraVinteDoisEMeioPorcento implements RegraDeCalculo {
    @Override
	public double calcula(Funcionario funcionario) {
		return funcionario.getSalario() - (funcionario.getSalario() * 0.225);
	}
}
