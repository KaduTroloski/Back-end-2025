import java.util.Random;
public class Main
{
    Random rd = new Random();
	public static void main(String[] args) {
    String[] nomes = {"Kevin", "Virgil", "Luka", "Alisson", "Jude"};
    String[] sobrenomes = {"De Bruyne", "van Dijk", "Modrić", "Becker", "Bellingham"};
    String[] posicoes = {"Meio-campista", "Zagueiro", "Meio-campista", "Goleiro", "Meio-campista"};
    String[] times = {"Manchester City", "Liverpool", "Real Madrid", "Liverpool", "Real Madrid"};
    Main obj = new Main();

    String timeDoJogador = times[obj.randomIndex(times)];
    String nomeDoJogador = nomes[obj.randomIndex(nomes)];
    String sobrenomeDoJogador = sobrenomes[obj.randomIndex(sobrenomes)];
    int idadeDoJogador = obj.randomAge();
    String posicaoDoJogador = posicoes[obj.randomIndex(posicoes)];

    System.out.printf("O jogador do %s, chamado %s %s, de %d anos, atua como %s.%n",
                    timeDoJogador,
                    nomeDoJogador,
                    sobrenomeDoJogador,
                    idadeDoJogador,
                    posicaoDoJogador);
	}
    
    public int randomIndex(String[] list) {
    int listLength = list.length;
    int randomIndex = rd.nextInt(listLength);
    return randomIndex;
    }
    public int randomAge() {
    int randomAge = rd.nextInt(16, 99);
    return randomAge;
    }
	
}