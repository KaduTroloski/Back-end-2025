import java.util.Random;
public class jogador {
    Random rd = new Random();
    public void gerarJogador() {
    String[] nomes = {"Kevin", "Virgil", "Luka", "Alisson", "Jude"};
    String[] sobrenomes = {"De Bruyne", "van Dijk", "Modrić", "Becker", "Bellingham"};
    String[] posicoes = {"Meio-campista", "Zagueiro", "Meio-campista", "Goleiro", "Meio-campista"};
    String[] times = {"Manchester City", "Liverpool", "Real Madrid", "Liverpool", "Real Madrid"};
    String timeDoJogador = times[this.randomIndex(times)];
    String nomeDoJogador = nomes[this.randomIndex(nomes)];
    String sobrenomeDoJogador = sobrenomes[this.randomIndex(sobrenomes)];
    int idadeDoJogador = this.randomAge();
    String posicaoDoJogador = posicoes[this.randomIndex(posicoes)];

    System.out.printf("O jogador do %s, chamado %s %s, de %d anos, atua como %s.%n",
                    timeDoJogador,
                    nomeDoJogador,
                    sobrenomeDoJogador,
                    idadeDoJogador,
                    posicaoDoJogador, '\n');
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