public class Main
{
	public static void main(String[] args) {
		Fatura f1 = new Fatura("11222", "Um celular legal", 1, 2100.80);
		Fatura f2 = new Fatura("21000", "Um pc bacana", 3, 3200.10);
		   
		FaturaTest testeFatura = new FaturaTest(f1, f2);
		testeFatura.gerarTeste();
	
	    Empregado ep1 = new Empregado("Kauan", "Propodoski", 2300.10);
	    Empregado ep2 = new Empregado("Karen", "Custodio", 4000.20);
	    
	    EmpregadoTest testeEmpregado = new EmpregadoTest(ep1, ep2);
	    testeEmpregado.SalarioAnual();
	    testeEmpregado.AumentarSalario(10);
	    testeEmpregado.SalarioAnual();
	}
}