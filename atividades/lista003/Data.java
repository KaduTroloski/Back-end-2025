import java.time.*;
public class Data{
    private int dia;
    private int mes;
    private int ano;
    
    public Data(int dd, int mm, int aa){
        this.verificaMes(mm, dd, aa);
        this.dia = dd;
        this.mes = mm;
        this.ano = aa;
    }
    
      public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void setDia(int dia) {
        this.verificaMes(this.mes, dia, this.ano);
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.verificaMes(mes, this.dia, this.ano);
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    private void verificaMes(int mm, int dd, int aa){
        if(mm < 1 || mm > 12){
             throw new IllegalArgumentException("O mes deve estar ser de 1 a 12");
        }
        YearMonth mesAtual = YearMonth.of(aa, mm);
        if(dd > mesAtual.lengthOfMonth() || dd < 1){
             throw new IllegalArgumentException("Este dia esta fora dos limites deste mes");
        }
    }
    public void displayData(){
        System.out.printf("%s/%s/%s", this.dia, this.mes, this.ano + "\n");
    }
}