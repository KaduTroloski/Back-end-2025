public class EmpregadoTest{
    private Empregado empregado01;
    private Empregado empregado02;
    
    public EmpregadoTest(Empregado emp1, Empregado emp2){
        this.empregado01 = emp1;
        this.empregado02 = emp2;
    }
    
    public void SalarioAnual(){
        System.out.print("Salario anual primeiro empregado: " + this.empregado01.getSalarioAnual() + "\n");
        System.out.print("Salario anual segundo empregado: " + this.empregado02.getSalarioAnual() + "\n");
    }
    
    public void AumentarSalario(double porcent){
        double salarioAtual =  this.empregado01.getSalario_mensal();
        double porcenNumber = ((porcent / 100) * salarioAtual) + salarioAtual;
        this.empregado01.setSalario_mensal(porcenNumber);
        
        salarioAtual =  this.empregado02.getSalario_mensal();
        porcenNumber = ((porcent / 100) * salarioAtual) + salarioAtual;
        this.empregado02.setSalario_mensal(porcenNumber);
        
        System.out.print("Salario aumentado" + "\n");
    }
}