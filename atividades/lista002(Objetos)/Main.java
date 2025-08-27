import java.util.Scanner;
public class Main
{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int nunPokemons = 0;
    String[] lista = {"A", "B", "E", "c", "w", "r", "4", "5", "7"};
    for(int i = 0; i < 5; i++){
        Senhas s1 = new Senhas(lista);
	    s1.gerarSenhas();
    }
    System.out.print("----------------------------\n");
    for(int i = 0; i < 10; i++){
        jogador p1 = new jogador();
	    p1.gerarJogador();
    }
    System.out.print("Digite o numero de pokemons que deseja gerar: ");
    nunPokemons = Integer.parseInt(sc.nextLine());
    System.out.print("----------------------------\n");
    for(int i = 0; i < nunPokemons; i++){
        pokemons po1 = new pokemons();
	    po1.gerarPokemon();
    }
    }
}