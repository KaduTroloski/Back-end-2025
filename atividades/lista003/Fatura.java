public class Fatura{
    private String id_fatura;
    private String descricao;
    private int qtd_items;
    private double preco_item;
    
    public Fatura(String id, String descricao, int qtd, double preco){
        this.id_fatura = id;
        this.descricao = descricao;
        if(qtd < 1 || preco < 1){
            this.qtd_items = 0;
            return;
        }
        this.qtd_items = qtd;
        this.preco_item = preco;
    }
    
        public String getId_fatura() {
        return id_fatura;
    }

    public void setId_fatura(String id_fatura) {
        this.id_fatura = id_fatura;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtd_items() {
        return qtd_items;
    }

    public void setQtd_items(int qtd_items) {
        if(qtd_items > 0){
        this.qtd_items = qtd_items;
        }
        this.qtd_items = 0;
    }

    public double getPreco_item() {
        return preco_item;
    }

    public void setPreco_item(double preco_item) {
        if(preco_item > 0){
        this.preco_item = preco_item;
        }
        this.preco_item = 0;
    }
    
    public double getTotalFatura() {
        return this.qtd_items * this.preco_item;
    }
    
}