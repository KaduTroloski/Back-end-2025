public class Empregado{
    private String nome;
    private String sobrenome;
    private double salario_mensal;
    
    public Empregado(String nome, String sobrenome, double salario){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario_mensal = salario;
    }
    
      public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public double getSalario_mensal() {
        return salario_mensal;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setSalario_mensal(double salario_mensal) {
        this.salario_mensal = salario_mensal;
    }
    
    public double getSalarioAnual(){
        return this.salario_mensal * 13;
    }
}