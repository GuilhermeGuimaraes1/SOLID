
package respunica;

public class Funcionario {
    
    private String nome;
    private Double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double calcularSalario() {
        return this.salario - (this.salario * 0.225);
    }
    
    public void cargo() {
        //metodo de cargo
        
    }
    
}
