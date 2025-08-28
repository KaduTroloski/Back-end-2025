public class FaturaTest{
    private Fatura instancia01;
    private Fatura instancia02;
    
    public FaturaTest(Fatura ins1, Fatura ins2){
        this.instancia01 = ins1;
        this.instancia02 = ins2;
    }
    
    public void gerarTeste() {
        System.out.print("Primeira fatura-----------------\n");
	    System.out.print(this.instancia01.getId_fatura() + '\n');
	    System.out.print(this.instancia01.getDescricao() + '\n');
	    System.out.print(this.instancia01.getQtd_items() + "\n");
	    System.out.print(this.instancia01.getPreco_item() + "\n");
	    
		System.out.print(this.instancia01.getTotalFatura() + "\n");
		
	    System.out.print("Segunda fatura------------------\n");
 	    System.out.print(this.instancia02.getId_fatura() + '\n');
	    System.out.print(this.instancia02.getDescricao() + '\n');
	    System.out.print(this.instancia02.getQtd_items() + "\n");
	    System.out.print(this.instancia02.getPreco_item() + "\n");       

		System.out.print(this.instancia02.getTotalFatura() + "\n");
    }
}