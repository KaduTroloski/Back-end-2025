import java.util.Random;
public class Senhas {
    String[] lista;
    
    public Senhas(String[] lista){
        this.lista = lista;
    }
    
    public void gerarSenhas(){
        Random rd = new Random();
        for(int i = 0; i <= 8; i++){
            String password = ""; 
            int randomIndex = rd.nextInt(this.lista.length);
            password += lista[randomIndex];
            System.out.printf(password);
        }
        System.out.print('\n');
    }
}